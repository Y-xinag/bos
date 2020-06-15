package com.xr.mapper;

import com.xr.entity.Supervisionfiling;
import com.xr.entity.SupervisionfilingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisionfilingMapper {
    long countByExample(SupervisionfilingExample example);

    int deleteByExample(SupervisionfilingExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Supervisionfiling record);

    int insertSelective(Supervisionfiling record);

    List<Supervisionfiling> selectByExample(SupervisionfilingExample example);

    Supervisionfiling selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Supervisionfiling record, @Param("example") SupervisionfilingExample example);

    int updateByExample(@Param("record") Supervisionfiling record, @Param("example") SupervisionfilingExample example);

    int updateByPrimaryKeySelective(Supervisionfiling record);

    int updateByPrimaryKey(Supervisionfiling record);
}