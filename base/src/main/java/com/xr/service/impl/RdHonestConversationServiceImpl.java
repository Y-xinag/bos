package com.xr.service.impl;

import com.xr.entity.RdHonestConversation;
import com.xr.mapper.RdHonestConversationMapper;
import com.xr.service.RdHonestConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RdHonestConversationServiceImpl implements RdHonestConversationService {

    @Autowired
    private RdHonestConversationMapper rdHonestConversationMapper;


    @Override
    public List<RdHonestConversation> querylist(Integer page, Integer limit) {
        return rdHonestConversationMapper.querylist(page, limit);
    }

    @Override
    public List<RdHonestConversation> pagenum() {
        return rdHonestConversationMapper.pagenum();
    }

    @Override
    public List<RdHonestConversation> queryBytitle(String talktype, Integer page, Integer limit) {
        return rdHonestConversationMapper.queryBytitle(talktype, page, limit);
    }

    @Override
    public List<RdHonestConversation> pageNum(String talktype) {
        return rdHonestConversationMapper.pageNum(talktype);
    }

    @Override
    public int delete(List<Integer> list) {
        return rdHonestConversationMapper.delete(list);
    }

    @Override
    public void add(RdHonestConversation rdHonestConversation) {
        rdHonestConversationMapper.add(rdHonestConversation);
    }

    @Override
    public void update(RdHonestConversation rdHonestConversation) {
        rdHonestConversationMapper.update(rdHonestConversation);
    }
}
