package com.xr.mapper;

import com.xr.entity.SysStaffPost;
import com.xr.entity.SysStaffPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStaffPostMapper {
    long countByExample(SysStaffPostExample example);

    int deleteByExample(SysStaffPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysStaffPost record);

    int insertSelective(SysStaffPost record);

    List<SysStaffPost> selectByExample(SysStaffPostExample example);

    SysStaffPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysStaffPost record, @Param("example") SysStaffPostExample example);

    int updateByExample(@Param("record") SysStaffPost record, @Param("example") SysStaffPostExample example);

    int updateByPrimaryKeySelective(SysStaffPost record);

    int updateByPrimaryKey(SysStaffPost record);
}