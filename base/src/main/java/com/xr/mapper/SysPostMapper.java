package com.xr.mapper;

import com.xr.entity.SysPost;
import com.xr.entity.SysPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPostMapper {
    long countByExample(SysPostExample example);

    int deleteByExample(SysPostExample example);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    List<SysPost> selectByExample(SysPostExample example);

    int updateByExampleSelective(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByExample(@Param("record") SysPost record, @Param("example") SysPostExample example);
}