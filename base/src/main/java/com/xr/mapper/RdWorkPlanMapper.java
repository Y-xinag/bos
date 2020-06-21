package com.xr.mapper;

import com.xr.entity.RdWorkPlan;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RdWorkPlanMapper {

    List<RdWorkPlan> querylist(@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select w.create_id,w.title,w.content,s.username,w.create_time,w.staus from rd_work_plan w ,sys_staff s where w.create_id=s.create_id AND w.state=1")
    List<RdWorkPlan> pageNum();

    List<RdWorkPlan> queryBytitle(@Param("titlename") String titlename,@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select w.id,w.create_id,w.title,w.content,s.username,w.create_time,w.staus from rd_work_plan w ,sys_staff s where w.create_id=s.create_id AND w.state=1 and w.title LIKE (CONCAT('%',#{titlename},'%'))")
    List<RdWorkPlan> pagenum(String titlename);

    @Insert("insert into rd_work_plan(title,content,create_time,create_id,staus,state) values(#{title},#{content},NOW(),#{createId},#{staus},1)")
    public void add(RdWorkPlan rdWorkPlan);

    @Update({"<script>update rd_work_plan set state=0 where id in "
            +"<foreach collection='list' item='id' index='i' open='(' separator= ',' close = ')'>"
            +"#{id}"
            +"</foreach>"
            +"</script>"
    })
    public int delete(List<Integer> list);

    @Update("update rd_work_plan set title=#{title},content=#{content},create_id=#{createId},staus=#{staus} where id=#{id}")
    public void update(RdWorkPlan rdWorkPlan);

    @Select("select *from queryById where id=#{id}")
    public RdWorkPlan queryById(Integer id);

}
