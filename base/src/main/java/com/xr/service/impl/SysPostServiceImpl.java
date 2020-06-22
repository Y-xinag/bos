package com.xr.service.impl;

import com.xr.entity.SysMechanism;
import com.xr.entity.SysPost;
import com.xr.entity.SysStaff;
import com.xr.mapper.SysPostMapper;
import com.xr.service.SysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPostServiceImpl implements SysPostService {
    @Autowired
    private SysPostMapper sysPostMapper;

    @Override
    public List<SysPost> list() {
        List<SysPost> list = sysPostMapper.list();
        return list;
    }

    @Override
    public List<SysPost> list1(String name, Integer page, Integer limit) {
        return sysPostMapper.list1(name,page,limit);
    }

    @Override
    public void PostAdd(SysPost sysPost) {
        sysPostMapper.insertSelective(sysPost);
    }

    @Override
    public void PostUpdate(SysPost sysPost) {
        sysPostMapper.update(sysPost);
    }

    @Override
    public void PostDelete(int id) {
        sysPostMapper.delete(id);
    }
}
