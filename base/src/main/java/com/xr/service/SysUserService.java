package com.xr.service;

import com.xr.entity.SysUser;

import java.util.List;

public interface SysUserService {
    /**
     * 用户登录
     * @param sysUser
     * @return
     */
   public SysUser login(SysUser sysUser);

    /**
     * 根据用户名查询用户信息
     * @return
     */
   public SysUser findUserByUserName(String name);

    /**
     * 根据用户名获得角色的集合
     * @param name
     * @return
     */
   public List<String> findUserRoles(String name);

    /**
     * 分页
     * @param page
     * @param limit
     * @return
     */
    List<SysUser> list1(Integer page,Integer limit);

    /**
     * 权限赋权
     * @param name
     * @return
     */
    public SysUser findSysUserSysRoleSysMenu(String name);

    public void add(SysUser sysUser);
    public void deleteById(Long id);
    public void update(SysUser sysUser);
    public List<SysUser> list(SysUser sysUser);
}
