package com.xr.mapper;

import com.xr.entity.SpvBack;
import com.xr.entity.SpvBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpvBackMapper {
    long countByExample(SpvBackExample example);

    int deleteByExample(SpvBackExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(SpvBack record);

    int insertSelective(SpvBack record);

    List<SpvBack> selectByExample(SpvBackExample example);

    SpvBack selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") SpvBack record, @Param("example") SpvBackExample example);

    int updateByExample(@Param("record") SpvBack record, @Param("example") SpvBackExample example);

    int updateByPrimaryKeySelective(SpvBack record);

    int updateByPrimaryKey(SpvBack record);
}