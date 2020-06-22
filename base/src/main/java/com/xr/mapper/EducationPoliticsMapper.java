package com.xr.mapper;

import com.xr.entity.EducationPolitics;
import com.xr.entity.EducationPoliticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationPoliticsMapper {

    @Select({"<script>",
            "select id, title, source, type, content, time, create_time createTime, create_id createId, staus",
            " from education_politics where 1=1",
            "<when test='title!=null'>",
            "and title like '%${title}%'",
            "</when>",
            "limit #{page},#{limit}",
            "</script>"})
    List<EducationPolitics> list1(@Param("title") String title, @Param("page") Integer page, @Param("limit") Integer limit);
    @Select("select * from education_politics")
    List<EducationPolitics> list();

    long countByExample(EducationPoliticsExample example);

    int deleteByExample(EducationPoliticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EducationPolitics record);

    int insertSelective(EducationPolitics record);

    List<EducationPolitics> selectByExampleWithBLOBs(EducationPoliticsExample example);

    List<EducationPolitics> selectByExample(EducationPoliticsExample example);

    EducationPolitics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EducationPolitics record, @Param("example") EducationPoliticsExample example);

    int updateByExampleWithBLOBs(@Param("record") EducationPolitics record, @Param("example") EducationPoliticsExample example);

    int updateByExample(@Param("record") EducationPolitics record, @Param("example") EducationPoliticsExample example);

    int updateByPrimaryKeySelective(EducationPolitics record);

    int updateByPrimaryKeyWithBLOBs(EducationPolitics record);

    int updateByPrimaryKey(EducationPolitics record);
}
