package com.xr.shiro;

import com.xr.entity.*;
import com.xr.service.SysStaffService;
import com.xr.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class MyShiroRealm extends AuthorizingRealm {
    @Override
    public String getName() {
        return "myShiroRealm";
    }

    @Autowired
    private SysStaffService sysStaffService;

    /**
     * 授权
     * doGetAuthorizationInfo方法是在我们调用
     * SecurityUtils.getSubject().isPermitted（）这个方法时触发，
     * 开启了注解就是进入有 @RequiresPermissions或@RequiresRoles() 两个注解时触发
     * 授权后用户角色及权限会保存在缓存中的
     *
     * @param principal
     * @return
     * @RequiresPermissions这个注解起始就是在执行SecurityUtils.getSubject().isPermitted（）
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        // 从session中获取 user 对象
        Session session = SecurityUtils.getSubject().getSession();
        SysStaff sysStaff = (SysStaff)session.getAttribute("USER_SESSION");
        // 查到权限数据，返回授权信息，要包括上面的权限和角色(可选，一般不这么用了)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 根据身份信息获取角色信息，权限信息
        SysStaff sysStaff1 = sysStaffService.findSysStaffSysPostSysPermission(sysStaff.getUsername());
        for (SysPost post : sysStaff1.getPosts()) {
            simpleAuthorizationInfo.addRole(post.getPname());
            System.out.println("postName:"+post.getPname());
            // 根据身份信息获取权限信息
            for (SysPermission m : post.getPermissions()) {
                if(m.getPermissionCode()!=null) {
                    simpleAuthorizationInfo.addStringPermission(m.getPermissionCode());
                    System.out.println("permissionName:"+m.getPermissionCode());
                }
            }
        }
        return simpleAuthorizationInfo;
    }

    /**
     * 认证.登录
     * doGetAuthenticationInfo这个方法是在用户登录的时候调用的
     * 也就是执行SecurityUtils.getSubject().login()的时候调用；(即:登录验证)
     * 验证通过后会用户保存在缓存中的
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
            try {
                //获取用户的输入的账号.
                String username = (String) token.getPrincipal();
                //通过username从数据库中查找 User对象，如果找到，没找到.
                //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
                SysStaff sysStaff = sysStaffService.findStaffByUserName(username);
                if (sysStaff == null) {
                    return null;
                }
                if (sysStaff.getStaus() == "2") { //账户删除

                    throw new LockedAccountException();
                } else if (sysStaff.getStaus() == "3"){ //账户离职
                    throw new LockedAccountException();
                }
                SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                        username, //用户名
                        sysStaff.getPassword(), //密码
                        ByteSource.Util.bytes(sysStaff.getSalt()),//salt密码加盐
                        getName()  // 当前 realm对象的name.调用父类的getName()方法即可
                );
                // 将用户信息存入到session
                Session session = SecurityUtils.getSubject().getSession();
                session.setAttribute("USER_SESSION", sysStaff);
                return authenticationInfo;
            }catch (Exception e) {
                e.printStackTrace();
            }
            return null;
    }
}
