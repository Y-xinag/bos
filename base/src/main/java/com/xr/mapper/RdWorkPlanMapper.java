package com.xr.mapper;

import com.xr.entity.RdWorkPlan;
import com.xr.entity.RdWorkPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RdWorkPlanMapper {
    long countByExample(RdWorkPlanExample example);

    int deleteByExample(RdWorkPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RdWorkPlan record);

    int insertSelective(RdWorkPlan record);

    List<RdWorkPlan> selectByExampleWithBLOBs(RdWorkPlanExample example);

    List<RdWorkPlan> selectByExample(RdWorkPlanExample example);

    RdWorkPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RdWorkPlan record, @Param("example") RdWorkPlanExample example);

    int updateByExampleWithBLOBs(@Param("record") RdWorkPlan record, @Param("example") RdWorkPlanExample example);

    int updateByExample(@Param("record") RdWorkPlan record, @Param("example") RdWorkPlanExample example);

    int updateByPrimaryKeySelective(RdWorkPlan record);

    int updateByPrimaryKeyWithBLOBs(RdWorkPlan record);

    int updateByPrimaryKey(RdWorkPlan record);
}