package com.xr.mapper;

import com.xr.entity.Datacollection;
import com.xr.entity.DatacollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatacollectionMapper {
    long countByExample(DatacollectionExample example);

    int deleteByExample(DatacollectionExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Datacollection record);

    int insertSelective(Datacollection record);

    List<Datacollection> selectByExample(DatacollectionExample example);

    Datacollection selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Datacollection record, @Param("example") DatacollectionExample example);

    int updateByExample(@Param("record") Datacollection record, @Param("example") DatacollectionExample example);

    int updateByPrimaryKeySelective(Datacollection record);

    int updateByPrimaryKey(Datacollection record);
}