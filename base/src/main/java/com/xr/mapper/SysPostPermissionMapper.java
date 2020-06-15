package com.xr.mapper;

import com.xr.entity.SysPostPermission;
import com.xr.entity.SysPostPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPostPermissionMapper {
    long countByExample(SysPostPermissionExample example);

    int deleteByExample(SysPostPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysPostPermission record);

    int insertSelective(SysPostPermission record);

    List<SysPostPermission> selectByExample(SysPostPermissionExample example);

    SysPostPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysPostPermission record, @Param("example") SysPostPermissionExample example);

    int updateByExample(@Param("record") SysPostPermission record, @Param("example") SysPostPermissionExample example);

    int updateByPrimaryKeySelective(SysPostPermission record);

    int updateByPrimaryKey(SysPostPermission record);
}