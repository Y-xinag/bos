package com.xr.mapper;

import com.xr.entity.DcpReport;
import com.xr.entity.DcpReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcpReportMapper {
    long countByExample(DcpReportExample example);

    int deleteByExample(DcpReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DcpReport record);

    int insertSelective(DcpReport record);

    List<DcpReport> selectByExample(DcpReportExample example);

    DcpReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DcpReport record, @Param("example") DcpReportExample example);

    int updateByExample(@Param("record") DcpReport record, @Param("example") DcpReportExample example);

    int updateByPrimaryKeySelective(DcpReport record);

    int updateByPrimaryKey(DcpReport record);
}