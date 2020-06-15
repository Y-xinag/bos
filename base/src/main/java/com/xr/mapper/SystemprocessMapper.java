package com.xr.mapper;

import com.xr.entity.Systemprocess;
import com.xr.entity.SystemprocessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemprocessMapper {
    long countByExample(SystemprocessExample example);

    int deleteByExample(SystemprocessExample example);

    int deleteByPrimaryKey(Integer sysid);

    int insert(Systemprocess record);

    int insertSelective(Systemprocess record);

    List<Systemprocess> selectByExample(SystemprocessExample example);

    Systemprocess selectByPrimaryKey(Integer sysid);

    int updateByExampleSelective(@Param("record") Systemprocess record, @Param("example") SystemprocessExample example);

    int updateByExample(@Param("record") Systemprocess record, @Param("example") SystemprocessExample example);

    int updateByPrimaryKeySelective(Systemprocess record);

    int updateByPrimaryKey(Systemprocess record);
}