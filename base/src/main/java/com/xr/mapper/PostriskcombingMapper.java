package com.xr.mapper;

import com.xr.entity.Postriskcombing;
import com.xr.entity.PostriskcombingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostriskcombingMapper {
    long countByExample(PostriskcombingExample example);

    int deleteByExample(PostriskcombingExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Postriskcombing record);

    int insertSelective(Postriskcombing record);

    List<Postriskcombing> selectByExample(PostriskcombingExample example);

    Postriskcombing selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Postriskcombing record, @Param("example") PostriskcombingExample example);

    int updateByExample(@Param("record") Postriskcombing record, @Param("example") PostriskcombingExample example);

    int updateByPrimaryKeySelective(Postriskcombing record);

    int updateByPrimaryKey(Postriskcombing record);
}