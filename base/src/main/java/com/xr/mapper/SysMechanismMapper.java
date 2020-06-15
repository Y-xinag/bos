package com.xr.mapper;

import com.xr.entity.SysMechanism;
import com.xr.entity.SysMechanismExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMechanismMapper {
    long countByExample(SysMechanismExample example);

    int deleteByExample(SysMechanismExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(SysMechanism record);

    int insertSelective(SysMechanism record);

    List<SysMechanism> selectByExample(SysMechanismExample example);

    SysMechanism selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") SysMechanism record, @Param("example") SysMechanismExample example);

    int updateByExample(@Param("record") SysMechanism record, @Param("example") SysMechanismExample example);

    int updateByPrimaryKeySelective(SysMechanism record);

    int updateByPrimaryKey(SysMechanism record);
}