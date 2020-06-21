package com.xr.mapper;


import com.xr.entity.RdHonestConversation;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RdHonestConversationMapper {

    @Select("select *from rd_honest_conversation where state=1 ORDER BY id DESC LIMIT #{page},#{limit}")
    @Results({
            @Result(column = "create_id",property = "createId"),
            @Result(column = "pid",property = "pid"),
            @Result(column = "mid",property = "mid"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "create_name",property = "createName")
    })
    public List<RdHonestConversation> querylist(@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select *from rd_honest_conversation where state=1")
    public List<RdHonestConversation> pagenum();


    @Select("select * from rd_honest_conversation where state=1 and talktype=#{talktype} ORDER BY id DESC LIMIT #{page},#{limit}")
    List<RdHonestConversation> queryBytitle(@Param("talktype") String talktype, @Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select * from rd_honest_conversation where talktype=#{talktype} and state=1")
    List<RdHonestConversation> pageNum(String talktype);

    @Update({"<script>update rd_honest_conversation set state=0 where id in "
            +"<foreach collection='list' item='id' index='i' open='(' separator= ',' close = ')'>"
            +"#{id}"
            +"</foreach>"
            +"</script>"
    })
    public int delete(List<Integer> list);

    @Insert("insert into rd_honest_conversation(pid,mid,politicaloutlook,post,talktype,talktime,talkplace,create_id,talktitle,talkcontent,create_time,create_name,staus,state) values(#{pid},#{mid},#{politicaloutlook},#{post},#{talktype},NOW(),#{talkplace},#{createId},#{talktitle},#{talkcontent},NOW(),#{createName},#{staus},1)")
    public void add(RdHonestConversation rdHonestConversation);

    @Update("update rd_honest_conversation set talktitle=#{talktitle},mid=#{mid},politicaloutlook=#{politicaloutlook},post=#{post},talktype=#{talktype},talktime=NOW(),talkplace=#{talkplace},create_id=#{createId},talktitle=#{talktitle},talkcontent=#{talkcontent},create_time=NOW(),create_name=#{createName},staus=#{staus} where id=#{id}")
    public void update(RdHonestConversation rdHonestConversation);
}
