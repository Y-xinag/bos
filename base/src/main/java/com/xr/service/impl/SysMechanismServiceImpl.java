package com.xr.service.impl;

import com.xr.entity.*;
import com.xr.mapper.SysMechanismMapper;
import com.xr.service.SysMechanismService;
import com.xr.util.SysDeptGroupUtil;
import com.xr.util.SysMechanismUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMechanismServiceImpl implements SysMechanismService {
    @Autowired
    private SysMechanismMapper sysMechanismMapper;

    @Override
    public List<SysMechanism> MechanismList(String mechanismName, Integer page, Integer limit) {
        return sysMechanismMapper.MechanismList(mechanismName, page, limit);
    }

    @Override
    public List<SysMechanism> MechanismSize() {
        return sysMechanismMapper.MechanismSize();
    }

    @Override
    public List<SysMechanism> groupMechanism() {
        // 查询出所有的部门信息
        SysMechanismExample example = new SysMechanismExample();
        SysMechanismExample.Criteria criteria = example.createCriteria();
        // 查询所有状态为0的
        //criteria.andDelFlagEqualTo(new Byte("0"));
        criteria.andStausEqualTo("正常");
        List<SysMechanism> MetList = sysMechanismMapper.selectByExample(example);
//        // 使用部门分组工具类来对所有部门进行分组
//        SysDeptGroupUtil util = new SysDeptGroupUtil();
//        list = util.getFirstDept(list);
//        return list;
        if(MetList!=null && MetList.size()>0){
            // 进行递归分组
            //SysDeptGroupUtil groupUtil = new SysDeptGroupUtil();
            SysMechanismUtil sysMechanismUtil = new SysMechanismUtil();
            MetList = sysMechanismUtil.getFirstMechanism(MetList);
            return MetList;
        }
        return null;
    }

    @Override
    public void MechanismAdd(SysMechanism sysMechanism) {
        sysMechanismMapper.insertSelective(sysMechanism);
    }

    @Override
    public void MechanismUpdate(SysMechanism sysMechanism) {
        sysMechanismMapper.updateByPrimaryKeySelective(sysMechanism);
    }

    @Override
    public void MechanismDelete(int mid) {
        sysMechanismMapper.deleteByPrimaryKey(mid);
    }
}
