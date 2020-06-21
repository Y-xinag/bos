package com.xr.service.impl;

import com.xr.entity.Riskpointwarning;
import com.xr.mapper.RiskpointwarningMapper;
import com.xr.service.RiskpointwarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskpointwarningServiceImpl implements RiskpointwarningService {

    @Autowired
    private RiskpointwarningMapper riskpointwarningMapper;

    @Override
    public List<Riskpointwarning> querylist(Integer page, Integer limit) {
        return riskpointwarningMapper.querylist(page, limit);
    }

    @Override
    public List<Riskpointwarning> pagenum() {
        return riskpointwarningMapper.pagenum();
    }

    @Override
    public List<Riskpointwarning> queryBytitle(String talktype, Integer page, Integer limit) {
        return riskpointwarningMapper.queryBytitle(talktype, page, limit);
    }

    @Override
    public List<Riskpointwarning> pageNum(String wtitle) {
        return riskpointwarningMapper.pageNum(wtitle);
    }

    @Override
    public void add(Riskpointwarning riskpointwarning) {
        riskpointwarningMapper.add(riskpointwarning);
    }

    @Override
    public int delete(List<Integer> list) {
        return riskpointwarningMapper.delete(list);
    }

    @Override
    public void update(Riskpointwarning riskpointwarning) {
        riskpointwarningMapper.update(riskpointwarning);
    }
}
