package com.xr.mapper;

import com.xr.entity.RdWorkDeployment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RdWorkDeploymentMapper {
    List<RdWorkDeployment> querylist(@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select d.id,d.title,d.content,d.create_time,s.username,d.staus from rd_work_deployment d,sys_staff s where d.create_id=s.create_id AND d.state=1")
    List<RdWorkDeployment> pagenum();

    List<RdWorkDeployment> queryBytitle(@Param("titlename") String titlename,@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select d.id,d.title,d.content,d.create_time,s.username,d.staus from rd_work_deployment d,sys_staff s where d.create_id=s.create_id AND d.state=1 and d.title LIKE (CONCAT('%',#{titlename},'%'))")
    List<RdWorkDeployment> pageNum(String titlename);

    @Insert("insert into rd_work_deployment(title,content,create_time,create_id,staus,state) values(#{title},#{content},NOW(),#{createId},#{staus},1)")
    public void add(RdWorkDeployment rdWorkDeployment);

    @Update({"<script>update rd_work_deployment set state=0 where id in "
            +"<foreach collection='list' item='id' index='i' open='(' separator= ',' close = ')'>"
            +"#{id}"
            +"</foreach>"
            +"</script>"
    })
    public int delete(List<Integer> list);

    @Update("update rd_work_deployment set title=#{title},content=#{content},create_id=#{createId},staus=#{staus} where id=#{id}")
    public void update(RdWorkDeployment rdWorkDeployment);
    
}
