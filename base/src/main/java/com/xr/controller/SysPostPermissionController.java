package com.xr.controller;

import com.xr.entity.SysPermission;
import com.xr.entity.SysPost;
import com.xr.mapper.SysPostMapper;
import com.xr.service.SysPostPermissionService;
import com.xr.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("postPermission")
public class SysPostPermissionController {
    @Autowired
    private SysPostPermissionService sysPostPermissionService;

    @Autowired
    private SysPostMapper sysPostMapper;

    @RequestMapping("group")
    public ResponseResult groupPermission(){
        List<SysPermission> sysPermissions = sysPostPermissionService.groupPermission();
        ResponseResult result = new ResponseResult();
        System.out.println(sysPermissions.toString());
        result.getData().put("permissionList",sysPermissions);
        return result;
    }

    @RequestMapping("list")
    public ResponseResult postPermissionlist(){
        ResponseResult result = new ResponseResult();
        List<SysPost> sysPosts = sysPostMapper.postPermissionList();
        System.out.println("取那啥"+sysPosts.toString());
        result.getData().put("postPermissionList",sysPosts);
        return result;
    }
}
