package com.xr.mapper;

import com.xr.entity.*;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SysStaffMapper {

    /**
     * 根据用户名查询角色集合
     * @param username
     * @return
     */
    @Select("SELECT p.pname from sys_staff s,sys_post p,sys_staff_post sp where p.pid = sp.post_id and s.username=#{username} and sp.staff_id=s.sid")
    List<String> findStaffPost(String username);

    /**
     * 分页
     * @param name
     * @param page
     * @param limit
     * @return
     */
    @Select({"<script>",
            "select sid, name, sex, age, age, educational_background educationalBackground, political_appearance politicalAppearance, phone, mid, username, pid, create_time createTime, create_id, staus",
             " from sys_staff where 1=1",
            "<when test='!name.equals(\"\")'>",
            "and name like '%${name}%'",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
        //@Select("select id,name,salt,email,mobile,status,dept_id,create_by,create_time,last_update_by,last_update_time,del_flag,introduction,avatar from sys_user LIMIT #{page},#{limit}")
    List<SysStaff> list1(@Param("name") String name, @Param("page") Integer page, @Param("limit") Integer limit);
    @Select("select sid, name, sex, age, age, educational_background educationalBackground, political_appearance politicalAppearance, phone, mid, username, pid, create_time createTime, create_id, staus from sys_staff")
    List<SysStaff> list();

    //权限赋权
    @Select("select * from sys_staff where username=#{username}")
    SysStaff findSysStaffName(String username);
    @Select("select * from sys_post p,sys_staff s,sys_staff_post sp where s.sid=sp.staff_id and p.pid=sp.post_id and s.sid=#{s.sid}")
    List<SysPost> findSysPostBySysStaffSid(@Param("s") SysStaff sysStaff);
    @Select("select m.permission_code 'permissionCode' from sys_post p,sys_permission m,sys_post_permission pm where p.pid=pm.postid and m.id=pm.pid and p.pname=#{p.pname}")
    List<SysPermission> findSysPermissionBySysPostPid(@Param("p") SysPost sysPost);

    long countByExample(SysStaffExample example);

    int deleteByExample(SysStaffExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(SysStaff record);

    int insertSelective(SysStaff record);

    List<SysStaff> selectByExample(SysStaffExample example);

    SysStaff selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByExample(@Param("record") SysStaff record, @Param("example") SysStaffExample example);

    int updateByPrimaryKeySelective(SysStaff record);

    int updateByPrimaryKey(SysStaff record);
}
