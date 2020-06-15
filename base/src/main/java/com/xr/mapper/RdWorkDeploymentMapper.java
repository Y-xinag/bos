package com.xr.mapper;

import com.xr.entity.RdWorkDeployment;
import com.xr.entity.RdWorkDeploymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RdWorkDeploymentMapper {
    long countByExample(RdWorkDeploymentExample example);

    int deleteByExample(RdWorkDeploymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RdWorkDeployment record);

    int insertSelective(RdWorkDeployment record);

    List<RdWorkDeployment> selectByExampleWithBLOBs(RdWorkDeploymentExample example);

    List<RdWorkDeployment> selectByExample(RdWorkDeploymentExample example);

    RdWorkDeployment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RdWorkDeployment record, @Param("example") RdWorkDeploymentExample example);

    int updateByExampleWithBLOBs(@Param("record") RdWorkDeployment record, @Param("example") RdWorkDeploymentExample example);

    int updateByExample(@Param("record") RdWorkDeployment record, @Param("example") RdWorkDeploymentExample example);

    int updateByPrimaryKeySelective(RdWorkDeployment record);

    int updateByPrimaryKeyWithBLOBs(RdWorkDeployment record);

    int updateByPrimaryKey(RdWorkDeployment record);
}