package com.xr.mapper;

import com.xr.entity.Letterreport;
import com.xr.entity.LetterreportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LetterreportMapper {
    long countByExample(LetterreportExample example);

    int deleteByExample(LetterreportExample example);

    int deleteByPrimaryKey(Integer lid);

    int insert(Letterreport record);

    int insertSelective(Letterreport record);

    List<Letterreport> selectByExample(LetterreportExample example);

    Letterreport selectByPrimaryKey(Integer lid);

    int updateByExampleSelective(@Param("record") Letterreport record, @Param("example") LetterreportExample example);

    int updateByExample(@Param("record") Letterreport record, @Param("example") LetterreportExample example);

    int updateByPrimaryKeySelective(Letterreport record);

    int updateByPrimaryKey(Letterreport record);
}