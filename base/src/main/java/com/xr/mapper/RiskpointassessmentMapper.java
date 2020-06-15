package com.xr.mapper;

import com.xr.entity.Riskpointassessment;
import com.xr.entity.RiskpointassessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskpointassessmentMapper {
    long countByExample(RiskpointassessmentExample example);

    int deleteByExample(RiskpointassessmentExample example);

    int deleteByPrimaryKey(Integer riskid);

    int insert(Riskpointassessment record);

    int insertSelective(Riskpointassessment record);

    List<Riskpointassessment> selectByExample(RiskpointassessmentExample example);

    Riskpointassessment selectByPrimaryKey(Integer riskid);

    int updateByExampleSelective(@Param("record") Riskpointassessment record, @Param("example") RiskpointassessmentExample example);

    int updateByExample(@Param("record") Riskpointassessment record, @Param("example") RiskpointassessmentExample example);

    int updateByPrimaryKeySelective(Riskpointassessment record);

    int updateByPrimaryKey(Riskpointassessment record);
}