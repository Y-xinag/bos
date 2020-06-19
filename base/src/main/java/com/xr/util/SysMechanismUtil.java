package com.xr.util;

import com.xr.entity.SysDept;
import com.xr.entity.SysMechanism;

import java.util.ArrayList;
import java.util.List;

public class SysMechanismUtil {

    /**
     * 获得一级部门
     * @param list
     * @return
     */
    public List<SysMechanism> getFirstMechanism(List<SysMechanism> list){
        List<SysMechanism> firstMechanism = new ArrayList<>();
        //查询所有的parentId为0的部门
        for (SysMechanism mechanism:list){
            if(mechanism.getParent().longValue()==0){
                mechanism.setMechanisms(getChildrenMechanism(mechanism.getMid(),list));
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
    public List<SysMechanism> getChildrenMechanism(Integer parent,List<SysMechanism> list){
        List<SysMechanism> childrenMechanism = new ArrayList<>();
        for (SysMechanism sysMechanism:list){
            // 一级部门不需要加进去
            if(sysMechanism.getBranch().longValue()==0){
                continue;
            }
            if(sysMechanism.getBranch().longValue()==parent){
                sysMechanism.setMechanisms(getChildrenMechanism(sysMechanism.getMid(),list));
                childrenMechanism.add(sysMechanism);
            }
        }
        return childrenMechanism;
    }
}
