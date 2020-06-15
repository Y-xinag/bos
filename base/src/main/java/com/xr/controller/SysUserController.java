package com.xr.controller;

import com.xr.entity.SysUser;
import com.xr.service.SysUserService;
import com.xr.util.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("user")
@Api("用户管理相关接口")
public class SysUserController {
    //依赖注入业务类
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("info")
    @ApiOperation(value = "获得登录用户信息", notes = "获得登录用户信息")
    public ResponseResult info(String token){
        /*SysUser user = sysUserService.findUserByUserName(token);
        List<String> roles =  sysUserService.findUserRoles(token);
        ResponseResult result = new ResponseResult();
        result.getData().put("roles",roles);
        result.getData().put("introduction",user.getIntroduction());
        result.getData().put("avatar",user.getAvatar());
        result.getData().put("name",user.getName());
        return result;*/
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        ResponseResult result = new ResponseResult();
        if(token.equals(subject.getSession().getId().toString())){
            // 从shiro的session里获得保存的用户信息
            SysUser loginUser = (SysUser) session.getAttribute("USER_SESSION");
            // 获得角色字符串集合
            List<String> roles = (List<String>) session.getAttribute("roles");
            if(loginUser!=null){
                // 根据用户获得角色字符串数组
                roles = sysUserService.findUserRoles(loginUser.getName());
                result.getData().put("roles",roles);
                result.getData().put("introduction",loginUser.getIntroduction());
                result.getData().put("avatar",loginUser.getAvatar());
                result.getData().put("name",loginUser.getName());
                return result;
            }
        }
        return null;
    }

    @RequestMapping("login")
    @ApiOperation(value = "用户登录",notes = "用户登录")
    public ResponseResult login(SysUser sysUser){
        ResponseResult result = new ResponseResult();
        /*SysUser loginUser = sysUserService.login(sysUser);
        if(loginUser!=null){
           // 返回给前台的toke，唯一标识用户
            result.getData().put("token",loginUser.getName());
        }else{
            //登录失败
            result.getData().put("message","登录失败，用户名或密码错误");
        }
        return result;*/
        UsernamePasswordToken token = new UsernamePasswordToken(sysUser.getName(), sysUser.getPassword());
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

    @RequestMapping("list")
    @RequiresPermissions("user:list")
    @ApiOperation(value = "获得用户列表",notes = "获得用户列表")
    public ResponseResult list(SysUser sysUser,Integer page,Integer limit){
        List<SysUser> list1 = sysUserService.list1((page-1)*limit, limit);
        List<SysUser> list = sysUserService.list(sysUser);
        ResponseResult result = new ResponseResult();

        System.out.println(list1.get(0).getCreateTime());
        System.out.println(list.get(0).getCreateTime());

        result.getData().put("items",list1);
        result.getData().put("total",list.size());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("user:add")
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public ResponseResult add(SysUser sysUser){
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        sysUser.setCreateTime(time);
        //生成盐（部分，需要存入数据库中）
        String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
        //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
        String password = new Md5Hash(sysUser.getPassword(),salt,2).toString();
        sysUser.setSalt(salt);
        sysUser.setPassword(password);
        sysUserService.add(sysUser);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("user:update")
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public ResponseResult update(SysUser sysUser){
        //生成盐（部分，需要存入数据库中）
        String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
        //将原始密码加盐（上面生成的盐），并且用md5算法加密两次，将最后结果存入数据库中
        String password = new Md5Hash(sysUser.getPassword(),salt,2).toString();
        sysUser.setSalt(salt);
        sysUser.setPassword(password);
        sysUserService.update(sysUser);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("user:delete")
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public ResponseResult add(Long id){
        sysUserService.deleteById(id);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","删除成功");
        return result;
    }
}
