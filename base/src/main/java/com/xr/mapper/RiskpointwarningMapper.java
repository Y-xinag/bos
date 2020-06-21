package com.xr.mapper;

import com.xr.entity.Riskpointwarning;

import java.util.List;

import org.apache.ibatis.annotations.*;


@Mapper
public interface RiskpointwarningMapper {

    @Select("select *from riskpointwarning where wStatus=1 ORDER BY wid DESC LIMIT #{page},#{limit}")
    @Results({
            @Result(column = "wTitle",property = "wtitle"),
            @Result(column = "wCreateName",property = "wcreatename"),
            @Result(column = "wCreateTime",property = "wcreatetime"),
    })
    List<Riskpointwarning> querylist(@Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select *from riskpointwarning where wStatus=1")
    public List<Riskpointwarning> pagenum();

    @Select("select * from riskpointwarning where wStatus=1 and wTitle LIKE (CONCAT('%',#{wtitle},'%')) ORDER BY wid DESC LIMIT #{page},#{limit}")
    List<Riskpointwarning> queryBytitle(@Param("wtitle") String wtitle, @Param("page") Integer page, @Param("limit") Integer limit);

    @Select("select * from riskpointwarning where wTitle=#{talktype} and wStatus=1")
    List<Riskpointwarning> pageNum(String talktype);

    @Insert("insert into riskpointwarning(warningId,wTitle,wContent,wCreateTime,wLoginId,wCreateName,wStatus,staus) values(#{warningid},#{wtitle},#{wcontent},NOW(),#{wloginid},#{wcreatename},1,#{staus})")
    public void add(Riskpointwarning riskpointwarning);

    @Update({"<script>update riskpointwarning set wStatus=0 where wid in "
            +"<foreach collection='list' item='wid' index='i' open='(' separator= ',' close = ')'>"
            +"#{wid}"
            +"</foreach>"
            +"</script>"
    })
    public int delete(List<Integer> list);

    @Update("update riskpointwarning set warningId=#{warningid},wTitle=#{wtitle},wContent=#{wcontent},wLoginId=#{wloginid},wCreateName=#{wcreatename},wCreateTime=NOW(),staus=#{staus} where wid=#{wid}")
    public void update(Riskpointwarning riskpointwarning);
}