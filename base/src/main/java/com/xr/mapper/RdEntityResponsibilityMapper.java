package com.xr.mapper;

import com.xr.entity.RdEntityResponsibility;
import com.xr.entity.RdEntityResponsibilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RdEntityResponsibilityMapper {
    long countByExample(RdEntityResponsibilityExample example);

    int deleteByExample(RdEntityResponsibilityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RdEntityResponsibility record);

    int insertSelective(RdEntityResponsibility record);

    List<RdEntityResponsibility> selectByExampleWithBLOBs(RdEntityResponsibilityExample example);

    List<RdEntityResponsibility> selectByExample(RdEntityResponsibilityExample example);

    RdEntityResponsibility selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RdEntityResponsibility record, @Param("example") RdEntityResponsibilityExample example);

    int updateByExampleWithBLOBs(@Param("record") RdEntityResponsibility record, @Param("example") RdEntityResponsibilityExample example);

    int updateByExample(@Param("record") RdEntityResponsibility record, @Param("example") RdEntityResponsibilityExample example);

    int updateByPrimaryKeySelective(RdEntityResponsibility record);

    int updateByPrimaryKeyWithBLOBs(RdEntityResponsibility record);

    int updateByPrimaryKey(RdEntityResponsibility record);
}