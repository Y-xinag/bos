package com.xr.mapper;

import com.xr.entity.SysLog;
import com.xr.entity.SysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SysLogMapper {

    @Select({"<script>",
            "select *",
            " from sys_log where 1=1",
            "<when test='title!=null'>",
            "and title like '%${title}%'",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    List<SysLog> list1(@Param("title") String title, @Param("page") Integer page, @Param("limit") Integer limit);
    @Select("select * from sys_log")
    List<SysLog> list();

    long countByExample(SysLogExample example);

    int deleteByExample(SysLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);

    SysLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogExample example);

    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}
