package com.xr.mapper;

import com.xr.entity.EducationPolitics;
import com.xr.entity.EducationPoliticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationPoliticsMapper {
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