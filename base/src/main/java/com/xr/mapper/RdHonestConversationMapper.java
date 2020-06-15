package com.xr.mapper;

import com.xr.entity.RdHonestConversation;
import com.xr.entity.RdHonestConversationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RdHonestConversationMapper {
    long countByExample(RdHonestConversationExample example);

    int deleteByExample(RdHonestConversationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RdHonestConversation record);

    int insertSelective(RdHonestConversation record);

    List<RdHonestConversation> selectByExampleWithBLOBs(RdHonestConversationExample example);

    List<RdHonestConversation> selectByExample(RdHonestConversationExample example);

    RdHonestConversation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RdHonestConversation record, @Param("example") RdHonestConversationExample example);

    int updateByExampleWithBLOBs(@Param("record") RdHonestConversation record, @Param("example") RdHonestConversationExample example);

    int updateByExample(@Param("record") RdHonestConversation record, @Param("example") RdHonestConversationExample example);

    int updateByPrimaryKeySelective(RdHonestConversation record);

    int updateByPrimaryKeyWithBLOBs(RdHonestConversation record);

    int updateByPrimaryKey(RdHonestConversation record);
}