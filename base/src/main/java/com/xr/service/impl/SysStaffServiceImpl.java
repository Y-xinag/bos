package com.xr.service.impl;

import com.xr.entity.*;
import com.xr.mapper.SysStaffMapper;
import com.xr.service.SysStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysStaffServiceImpl implements SysStaffService {
    @Autowired
    private SysStaffMapper sysStaffMapper;

    @Override
    public SysStaff login(SysStaff sysStaff) {
        // 构建自定义查询条件
        SysStaffExample example = new SysStaffExample();
        SysStaffExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(sysStaff.getUsername());
        criteria.andPasswordEqualTo(sysStaff.getPassword());
        List<SysStaff> list =  sysStaffMapper.selectByExample(example);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return  null;
    }

    @Override
    public SysStaff findStaffByUserName(String name) {
        SysStaffExample example = new SysStaffExample();
        SysStaffExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(name);
        List<SysStaff> list =  sysStaffMapper.selectByExample(example);
        if(list!=null && list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<String> findStaffPost(String username) {
        List<String> staffPost = sysStaffMapper.findStaffPost(username);
        return staffPost;
    }

    @Override
    public List<SysStaff> list1(String name, Integer page, Integer limit) {
        List<SysStaff> sysStaffs = sysStaffMapper.list1(name, page, limit);
        return sysStaffs;
    }

    @Override
    public SysStaff findSysStaffSysPostSysPermission(String name) {
        SysStaff sysStaffName = sysStaffMapper.findSysStaffName(name);
        List<SysPost> sysPostBySysStaffSid = sysStaffMapper.findSysPostBySysStaffSid(sysStaffName);
        List<SysPost> rolelist=new ArrayList<>();
        if(sysPostBySysStaffSid!=null){
            for (SysPost sysPost : sysPostBySysStaffSid) {
                List<SysPermission> sysMenusBySysRoleid = sysStaffMapper.findSysPermissionBySysPostPid(sysPost);
                sysPost.setPermissions(sysMenusBySysRoleid);
                rolelist.add(sysPost);
            }
            sysStaffName.setPosts(rolelist);
        }
        return sysStaffName;
    }

    @Override
    public void add(SysStaff sysStaff) {
        sysStaffMapper.insertSelective(sysStaff);
    }

    @Override
    public void deleteById(Integer sid) {
        sysStaffMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public void update(SysStaff sysStaff) {
        sysStaffMapper.updateByPrimaryKeySelective(sysStaff);
    }

    @Override
    public List<SysStaff> list(SysStaff sysStaff) {
        SysStaffExample example = new SysStaffExample();
        SysStaffExample.Criteria criteria = example.createCriteria();
        if(sysStaff!=null){
            if(sysStaff.getUsername()!=null){
                criteria.andUsernameLike("%"+sysStaff.getUsername()+"%");
            }
            // 还可以添加其他属性的条件
        }
        List<SysStaff> list =  sysStaffMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<SysStaff> querylist() {
        return sysStaffMapper.querylist();
    }
}
