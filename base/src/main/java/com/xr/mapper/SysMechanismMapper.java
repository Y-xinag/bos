package com.xr.mapper;

import com.xr.entity.SysMechanism;
import com.xr.entity.SysMechanismExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SysMechanismMapper {


    @Select({"<script>",
            "select mid, mechanism_name mechanismName, sid, parent, branch, create_time createTime, create_id createId, staus from sys_mechanism where 1=1",
            "<when test='mechanismName!=null'>",
            "and mechanism_name like '%${mechanismName}%'",
            "</when>",
            "<when test='sid!=null'>",
            "and sid = #{sid}",
            "</when>",
            "<when test='staus!=null'>",
            "and staus = #{staus}",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    List<SysMechanism> MechanismList(@Param("sid") Integer sid, @Param("staus") String staus, @Param("mechanismName") String mechanismName, @Param("page") Integer page, @Param("limit") Integer limit);
    @Select("select * from sys_mechanism")
    List<SysMechanism> MechanismSize();

    long countByExample(SysMechanismExample example);

    int deleteByExample(SysMechanismExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(SysMechanism record);

    int insertSelective(SysMechanism record);

    List<SysMechanism> selectByExample(SysMechanismExample example);

    SysMechanism selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") SysMechanism record, @Param("example") SysMechanismExample example);

    int updateByExample(@Param("record") SysMechanism record, @Param("example") SysMechanismExample example);

    int updateByPrimaryKeySelective(SysMechanism record);

    int updateByPrimaryKey(SysMechanism record);
}
