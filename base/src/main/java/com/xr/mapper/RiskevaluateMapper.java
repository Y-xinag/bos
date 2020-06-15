package com.xr.mapper;

import com.xr.entity.Riskevaluate;
import com.xr.entity.RiskevaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskevaluateMapper {
    long countByExample(RiskevaluateExample example);

    int deleteByExample(RiskevaluateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Riskevaluate record);

    int insertSelective(Riskevaluate record);

    List<Riskevaluate> selectByExample(RiskevaluateExample example);

    Riskevaluate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Riskevaluate record, @Param("example") RiskevaluateExample example);

    int updateByExample(@Param("record") Riskevaluate record, @Param("example") RiskevaluateExample example);

    int updateByPrimaryKeySelective(Riskevaluate record);

    int updateByPrimaryKey(Riskevaluate record);
}