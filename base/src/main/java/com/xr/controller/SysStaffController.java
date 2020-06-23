package com.xr.controller;

import com.xr.entity.SysStaff;
import com.xr.service.SysStaffService;
import com.xr.util.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("staff")
public class SysStaffController {
    @Autowired
    private SysStaffService sysStaffService;

    @RequestMapping("info")
    public ResponseResult info(String token){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        if(token.equals(subject.getSession().getId().toString())){
            // 从shiro的session里获得保存的用户信息
            SysStaff loginStaff = (SysStaff) session.getAttribute("USER_SESSION");
            // 获得角色字符串集合
            List<String> roles = (List<String>) session.getAttribute("roles");
            if(loginStaff!=null){
                // 根据用户获得角色字符串数组
                roles = sysStaffService.findStaffPost(loginStaff.getUsername());
                result.getData().put("roles",roles);
                /*result.getData().put("introduction",loginStaff.getIntroduction());
                result.getData().put("avatar",loginStaff.getAvatar());*/
                result.getData().put("username",loginStaff.getUsername());
                return result;
            }
        }
        return null;
    }

    @RequestMapping("login")
    public ResponseResult login(SysStaff sysStaff){
        ResponseResult result = new ResponseResult();
        UsernamePasswordToken token = new UsernamePasswordToken(sysStaff.getUsername(), sysStaff.getPassword());
        // 获得登录的主题
        Subject subject = SecurityUtils.getSubject();
        // 调用登录方法
        subject.login(token);
        // 返回给前台的toke，唯一标识用户
        result.getData().put("token",subject.getSession().getId());
        return result;
    }

    @RequestMapping("logout")
    @ApiOperation(value = "注销用户",notes = "注销用户")
    public ResponseResult logout(){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        // 只需调用shiro的logout方法就可以了
        subject.logout();
        return result;
    }


    @RequestMapping("index")
    @RequiresPermissions("role:index")
    public ResponseResult index(){
        ResponseResult result = new ResponseResult();
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysStaff loginStaff = (SysStaff) session.getAttribute("USER_SESSION");
        //System.out.println(loginStaff.getSid());
        result.getData().put("createId",loginStaff.getSid());
        return result;
    }

    @RequestMapping("list")
    @RequiresPermissions("role:list")
    @ApiOperation(value = "获得用户列表",notes = "获得用户列表")
    public ResponseResult list(SysStaff sysStaff,Integer page,Integer limit){
        List<SysStaff> list1 = sysStaffService.list1(sysStaff.getName(),(page-1)*limit, limit);
        List<SysStaff> list = sysStaffService.list();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("group")
    public ResponseResult groupStaff(){
        List<SysStaff> list = sysStaffService.list();
        ResponseResult result = new ResponseResult();
        result.getData().put("staffList",list);
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("role:add")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult add(SysStaff sysStaff){
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        sysStaff.setCreateTime(time);
        //默认正常
        sysStaff.setStaus("1");
        //生成盐（部分，需要存入数据库中）
        String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
        //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
        String password = new Md5Hash(sysStaff.getPassword(),salt,2).toString();
        sysStaff.setSalt(salt);
        sysStaff.setPassword(password);
        sysStaffService.add(sysStaff);
        System.out.println(sysStaff.toString());
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("role:update")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult update(SysStaff sysStaff){
        if (sysStaff.getPassword()!=null){
            //生成盐（部分，需要存入数据库中）
            String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
            //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
            String password = new Md5Hash(sysStaff.getPassword(),salt,2).toString();
            sysStaff.setSalt(salt);
            sysStaff.setPassword(password);
        }
        sysStaffService.update(sysStaff);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("role:delete")
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public ResponseResult delete(Integer id){
        sysStaffService.deleteById(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }

    @RequestMapping("weight")
    @RequiresPermissions("role:weight")
    @ApiOperation(value = "用户赋权",notes = "用户赋权")
    public ResponseResult weight(SysStaff sysStaff){
        sysStaffService.authority(Integer.parseInt(sysStaff.getPid()), sysStaff.getSid());
        ResponseResult result = new ResponseResult();
        result.getData().put("message","赋权成功");
        return result;
    }
}
