package com.xr.mapper;

import com.xr.entity.SysPost;
import com.xr.entity.SysPostExample;
import java.util.List;

import com.xr.entity.SysStaff;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface SysPostMapper {

    @Select({"<script>",
            "select pid, pname, mid, message, create_time createTime, create_id createId, staus",
            " from sys_post where 1=1",
            "<when test='pname!=null'>",
            "and pname like '%${pname}%'",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
        //@Select("select id,name,salt,email,mobile,status,dept_id,create_by,create_time,last_update_by,last_update_time,del_flag,introduction,avatar from sys_user LIMIT #{page},#{limit}")
    List<SysPost> list1(@Param("pname") String pname, @Param("page") Integer page, @Param("limit") Integer limit);
    @Select("select * from sys_post")
    List<SysPost> list();

    @Delete("delete from sys_post where pid=#{pid}")
    void delete(Integer pid);

    @Update("update sys_post set pname=#{pname}, mid=#{mid}, message=#{message}, create_time=#{createTime}, create_id=#{createId}, staus=#{staus} where pid=#{pid}")
    void update(SysPost sysPost);


    @Select("select * from sys_post")
    @Results(id = "employeeMap", value = {
            @Result(property = "pid", column = "pid"),//加此行，否则id值为空
            @Result(property = "sysPermission", column = "id", one = @One(select =
                    "com.xr.mapper.SysPermissionMapper.selectByPrimaryKey"))
    })
    List<SysPost> postPermissionList();

    long countByExample(SysPostExample example);

    int deleteByExample(SysPostExample example);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    List<SysPost> selectByExample(SysPostExample example);

    int updateByExampleSelective(@Param("record") SysPost record, @Param("example") SysPostExample example);

    int updateByExample(@Param("record") SysPost record, @Param("example") SysPostExample example);
}
