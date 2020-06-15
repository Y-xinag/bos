package com.xr.mapper;

import com.xr.entity.Riskdisposition;
import com.xr.entity.RiskdispositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskdispositionMapper {
    long countByExample(RiskdispositionExample example);

    int deleteByExample(RiskdispositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Riskdisposition record);

    int insertSelective(Riskdisposition record);

    List<Riskdisposition> selectByExample(RiskdispositionExample example);

    Riskdisposition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Riskdisposition record, @Param("example") RiskdispositionExample example);

    int updateByExample(@Param("record") Riskdisposition record, @Param("example") RiskdispositionExample example);

    int updateByPrimaryKeySelective(Riskdisposition record);

    int updateByPrimaryKey(Riskdisposition record);
}