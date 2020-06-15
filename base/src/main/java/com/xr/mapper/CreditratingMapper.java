package com.xr.mapper;

import com.xr.entity.Creditrating;
import com.xr.entity.CreditratingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditratingMapper {
    long countByExample(CreditratingExample example);

    int deleteByExample(CreditratingExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Creditrating record);

    int insertSelective(Creditrating record);

    List<Creditrating> selectByExample(CreditratingExample example);

    Creditrating selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Creditrating record, @Param("example") CreditratingExample example);

    int updateByExample(@Param("record") Creditrating record, @Param("example") CreditratingExample example);

    int updateByPrimaryKeySelective(Creditrating record);

    int updateByPrimaryKey(Creditrating record);
}