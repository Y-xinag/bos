package com.xr.service;

import com.xr.entity.SysMechanism;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMechanismService {

    //分页查询,显示全部
    List<SysMechanism> MechanismList(@Param("mechanismName") String mechanismName, @Param("page") Integer page, @Param("limit") Integer limit);
    List<SysMechanism> MechanismSize();

    List<SysMechanism> groupMechanism();

    //添加
    void MechanismAdd(SysMechanism sysMechanism);

    //修改
    void MechanismUpdate(SysMechanism sysMechanism);

    //删除
    void MechanismDelete(int mid);
}
