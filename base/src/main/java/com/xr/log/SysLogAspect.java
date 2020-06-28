package com.xr.log;

import com.alibaba.fastjson.JSON;
import com.xr.entity.SysLog;
import com.xr.entity.SysStaff;
import com.xr.service.SysLogService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 系统日志：切面处理类
 */
@Aspect
@Component
public class SysLogAspect {
    /**我这里是使用log4j2把一些信息打印在控制台上面，可以不写 */
    private static final Logger log = LogManager.getLogger(SysLogAspect.class);

    @Autowired
    private SysLogService sysLogService;

    //定义切点 @Pointcut
    //在注解的位置切入代码
    @Pointcut("@annotation(com.xr.log.MyLog)")
    public void logPoinCut(){
    }

    //切面 配置通知
    @Before("logPoinCut()")
    public void saveOperation(JoinPoint joinPoint){
        log.info("---------------接口日志记录---------------");
        //用于保存日志
        SysLog sysLog = new SysLog();
        //从切面织入点处通过反射机制获取织入点处的方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取切入点所在的方法
        Method method = signature.getMethod();
        //获取操作--方法上的Log的值
        MyLog myLog = method.getAnnotation(MyLog.class);
        if (myLog != null){
            //保存操作事件
            String operation = myLog.operation();
            sysLog.setTitle(operation);

            //保存日志类型
            String type = myLog.type();
            sysLog.setType(type);
        }
        //获取请求的类名
        String name = joinPoint.getTarget().getClass().getName();
        //获取请求的方法名
        String methodName = method.getName();
        sysLog.setMethod(name + "." + methodName);

        //请求的参数
        Object[] args = joinPoint.getArgs();
        //将参数所在的数组转换成json
        String data = JSON.toJSONString(args);
        sysLog.setData(data);

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String requestURL = request.getRequestURL().toString();
        sysLog.setUrl(requestURL);
        // 客户端ip
        String ip = request.getRemoteAddr();
        sysLog.setIp(ip);
        // 操作人账号、姓名（需要提前将用户信息存到session）
        SysStaff loginStaff = (SysStaff) request.getSession().getAttribute("USER_SESSION");
        if(loginStaff != null){
            Integer sid = loginStaff.getSid();
            sysLog.setSid(sid);
        }
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        sysLog.setTime(time);
        System.out.println("日志:"+sysLog.toString());
        sysLogService.LogAdd(sysLog);
    }
}
