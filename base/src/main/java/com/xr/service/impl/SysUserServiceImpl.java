package com.xr.service.impl;

import com.xr.entity.SysMenu;
import com.xr.entity.SysRole;
import com.xr.entity.SysUser;
import com.xr.entity.SysUserExample;
import com.xr.mapper.SysUserMapper;
import com.xr.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void add(SysUser sysUser) {
        sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public void deleteById(Long id) {
        sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(SysUser sysUser) {
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public List<SysUser> list(SysUser sysUser) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if(sysUser!=null){
            if(sysUser.getName()!=null){
                criteria.andUsernameLike("%"+sysUser.getName()+"%");
            }
            // 还可以添加其他属性的条件
        }
        List<SysUser> list =  sysUserMapper.selectByExample(example);
        return list;
    }

    @Override
    public SysUser login(SysUser sysUser) {
        // 构建自定义查询条件
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(sysUser.getName());
        criteria.andPasswordEqualTo(sysUser.getPassword());
        List<SysUser> list =  sysUserMapper.selectByExample(example);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return  null;
    }

    @Override
    public SysUser findUserByUserName(String name) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(name);
        List<SysUser> list =  sysUserMapper.selectByExample(example);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<String> findUserRoles(String name) {
        List<String> roles = sysUserMapper.findUserRoles(name);
        return roles;
    }

    @Override
    public List<SysUser> list1(String name, Integer page, Integer limit) {
        return sysUserMapper.list1(name,page,limit);
    }

    @Override
    public SysUser findSysUserSysRoleSysMenu(String name) {
        SysUser sysUserName = sysUserMapper.findSysUserName(name);
        List<SysRole> sysRolesBySysUserId = sysUserMapper.findSysRolesBySysUserId(sysUserName);
        List<SysRole> rolelist=new ArrayList<>();
        if(sysRolesBySysUserId!=null){
            for (SysRole sysRole : sysRolesBySysUserId) {
                List<SysMenu> sysMenusBySysRoleid = sysUserMapper.findSysMenusBySysRoleid(sysRole);
                sysRole.setMenus(sysMenusBySysRoleid);
                rolelist.add(sysRole);
            }
            sysUserName.setRoles(rolelist);
        }
        return sysUserName;
    }
}
