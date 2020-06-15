package com.xr.mapper;

import com.xr.entity.SpvDuty;
import com.xr.entity.SpvDutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpvDutyMapper {
    long countByExample(SpvDutyExample example);

    int deleteByExample(SpvDutyExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(SpvDuty record);

    int insertSelective(SpvDuty record);

    List<SpvDuty> selectByExample(SpvDutyExample example);

    SpvDuty selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") SpvDuty record, @Param("example") SpvDutyExample example);

    int updateByExample(@Param("record") SpvDuty record, @Param("example") SpvDutyExample example);

    int updateByPrimaryKeySelective(SpvDuty record);

    int updateByPrimaryKey(SpvDuty record);
}