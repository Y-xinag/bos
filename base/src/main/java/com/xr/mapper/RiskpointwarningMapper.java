package com.xr.mapper;

import com.xr.entity.Riskpointwarning;
import com.xr.entity.RiskpointwarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskpointwarningMapper {
    long countByExample(RiskpointwarningExample example);

    int deleteByExample(RiskpointwarningExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Riskpointwarning record);

    int insertSelective(Riskpointwarning record);

    List<Riskpointwarning> selectByExample(RiskpointwarningExample example);

    Riskpointwarning selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Riskpointwarning record, @Param("example") RiskpointwarningExample example);

    int updateByExample(@Param("record") Riskpointwarning record, @Param("example") RiskpointwarningExample example);

    int updateByPrimaryKeySelective(Riskpointwarning record);

    int updateByPrimaryKey(Riskpointwarning record);
}