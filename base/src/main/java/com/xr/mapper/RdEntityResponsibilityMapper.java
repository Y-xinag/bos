package com.xr.mapper;

import com.xr.entity.RdEntityResponsibility;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RdEntityResponsibilityMapper {

    List<RdEntityResponsibility> querylist(@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select e.id,e.title,e.content,e.create_time,s.username,e.staus from rd_entity_responsibility e,sys_staff s where e.create_id=s.create_id AND e.state=1")
    List<RdEntityResponsibility> pagenum();

    List<RdEntityResponsibility> queryBytitle(@Param("titlename") String titlename,@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select e.id,e.title,e.content,e.create_time,s.username,e.staus from rd_entity_responsibility e,sys_staff s where e.create_id=s.create_id AND e.state=1 and e.title LIKE (CONCAT('%',#{titlename},'%'))")
    List<RdEntityResponsibility> pageNum(String titlename);

    @Insert("insert into rd_entity_responsibility(title,content,create_time,create_id,staus,state) values(#{title},#{content},NOW(),#{createId},#{staus},1)")
    public void add(RdEntityResponsibility rdEntityResponsibility);

    @Update({"<script>update rd_entity_responsibility set state=0 where id in "
            +"<foreach collection='list' item='id' index='i' open='(' separator= ',' close = ')'>"
            +"#{id}"
            +"</foreach>"
            +"</script>"
    })
    public int delete(List<Integer> list);

    @Update("update rd_entity_responsibility set title=#{title},content=#{content},create_id=#{createId},staus=#{staus} where id=#{id}")
    public void update(RdEntityResponsibility rdEntityResponsibility);
}
