package com.xr.mapper;

import com.xr.entity.SysMenu;
import com.xr.entity.SysRole;
import com.xr.entity.SysUser;
import com.xr.entity.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    /**
     * 根据用户名查询角色集合
     * @param name
     * @return
     */

    public List<String> findUserRoles(String name);

    @Select({"<script>",
            "select * from sys_user where 1=1",
            "<when test='!name.equals(\"\")'>",
            "and name like '%${name}%'",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    //@Select("select id,name,salt,email,mobile,status,dept_id,create_by,create_time,last_update_by,last_update_time,del_flag,introduction,avatar from sys_user LIMIT #{page},#{limit}")
    List<SysUser> list1(@Param("name") String name, @Param("page") Integer page,@Param("limit") Integer limit);

    //权限赋权
    @Select("select * from sys_user where name=#{name}")
    SysUser findSysUserName(String name);
    @Select("select * from sys_role r,sys_user u,sys_user_role ur where u.id=ur.user_id and r.id=ur.role_id and u.id=#{u.id}")
    List<SysRole> findSysRolesBySysUserId(@Param("u") SysUser sysUser);
    @Select("select * from sys_role r,sys_menu m,sys_role_menu rm where r.id=rm.role_id and m.id=rm.menu_id and r.name=#{r.name}")
    List<SysMenu> findSysMenusBySysRoleid(@Param("r") SysRole sysRole);

    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}
