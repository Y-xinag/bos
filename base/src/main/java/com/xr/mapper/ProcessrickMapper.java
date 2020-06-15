package com.xr.mapper;

import com.xr.entity.Processrick;
import com.xr.entity.ProcessrickExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessrickMapper {
    long countByExample(ProcessrickExample example);

    int deleteByExample(ProcessrickExample example);

    int deleteByPrimaryKey(Integer proid);

    int insert(Processrick record);

    int insertSelective(Processrick record);

    List<Processrick> selectByExample(ProcessrickExample example);

    Processrick selectByPrimaryKey(Integer proid);

    int updateByExampleSelective(@Param("record") Processrick record, @Param("example") ProcessrickExample example);

    int updateByExample(@Param("record") Processrick record, @Param("example") ProcessrickExample example);

    int updateByPrimaryKeySelective(Processrick record);

    int updateByPrimaryKey(Processrick record);
}