package com.xr.service.impl;

import com.xr.entity.SysPermission;
import com.xr.entity.SysPermissionExample;
import com.xr.entity.SysPostPermission;
import com.xr.entity.SysPostPermissionExample;
import com.xr.mapper.SysPermissionMapper;
import com.xr.mapper.SysPostPermissionMapper;
import com.xr.service.SysPostPermissionService;
import com.xr.util.SysMechanismUtil;
import com.xr.util.SysPermissionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPostPermissionServiceImpl implements SysPostPermissionService {
    @Autowired
    private SysPostPermissionMapper sysPostPermissionMapper;

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public List<SysPermission> groupPermission() {
        SysPermissionExample sysPermissionExample = new SysPermissionExample();
        SysPermissionExample.Criteria criteria = sysPermissionExample.createCriteria();
        List<SysPermission> sysPermissions = sysPermissionMapper.selectByExample(sysPermissionExample);
        if(sysPermissions!=null && sysPermissions.size()>0){
            // 进行递归分组
            //SysDeptGroupUtil groupUtil = new SysDeptGroupUtil();
            SysPermissionUtil sysPermissionUtil = new SysPermissionUtil();
            sysPermissions = sysPermissionUtil.getFirstMechanism(sysPermissions);
            return sysPermissions;
        }
        return null;
    }
}
