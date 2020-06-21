package com.xr.service;

import com.xr.entity.SysStaff;
import com.xr.entity.SysUser;

import java.util.List;

public interface SysStaffService {
    /**
     * 用户登录
     * @param sysStaff
     * @return
     */
    public SysStaff login(SysStaff sysStaff);

    /**
     * 根据用户名查询用户信息
     * @return
     */
    public SysStaff findStaffByUserName(String name);

    /**
     * 根据用户名获得角色的集合
     * @param name
     * @return
     */
    public List<String> findStaffPost(String name);

    /**
     * 分页
     * @param page
     * @param limit
     * @return
     */
    List<SysStaff> list1(String name, Integer page, Integer limit);

    /**
     * 权限赋权
     * @param name
     * @return
     */
    public SysStaff findSysStaffSysPostSysPermission(String name);

    public void add(SysStaff sysStaff);
    public void deleteById(Integer id);
    public void update(SysStaff sysStaff);
    public List<SysStaff> list(SysStaff sysStaff);
    List<SysStaff> querylist();
}
