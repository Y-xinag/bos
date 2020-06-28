package com.xr.util;

import com.xr.entity.SysMechanism;
import com.xr.entity.SysPermission;
import com.xr.entity.SysPostPermission;

import java.util.ArrayList;
import java.util.List;

public class SysPermissionUtil {

    /**
     * 获得一级权限
     * @param list
     * @return
     */
    public List<SysPermission> getFirstMechanism(List<SysPermission> list){
        List<SysPermission> firstMechanism = new ArrayList<>();
        //查询所有的parentId为0的部门

        for (SysPermission mechanism:list){
            if(mechanism.getParent().longValue()==0){
                mechanism.setPermissions(getChildrenMechanism(mechanism.getId(), list));
                //mechanism.setMechanisms(getChildrenMechanism(mechanism.getMid(),list));
                firstMechanism.add(mechanism);
            }
        }
        return firstMechanism;
    }

    /**
     * 递归调用获得所有部门的子集
     * @param parent
     * @param list
     * @return
     */
    public List<SysPermission> getChildrenMechanism(Integer parent, List<SysPermission> list){
        List<SysPermission> childrenMechanism = new ArrayList<>();
        for (SysPermission sysPermission:list){
            // 一级部门不需要加进去
            if(sysPermission.getParent().longValue()==0){
                continue;
            }
            if(sysPermission.getParent().longValue()==parent){
                sysPermission.setPermissions(getChildrenMechanism(sysPermission.getId(),list));
                childrenMechanism.add(sysPermission);
            }
        }
        return childrenMechanism;
    }
}
