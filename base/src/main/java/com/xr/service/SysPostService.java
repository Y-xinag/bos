package com.xr.service;

import com.xr.entity.SysMechanism;
import com.xr.entity.SysPost;

import java.util.List;

public interface SysPostService {

    List<SysPost> list();
    List<SysPost> list1(String name, Integer page, Integer limit);

    //添加
    void PostAdd(SysPost sysPost);

    //修改
    void PostUpdate(SysPost sysPost);

    //删除
    void PostDelete(int id);
}
