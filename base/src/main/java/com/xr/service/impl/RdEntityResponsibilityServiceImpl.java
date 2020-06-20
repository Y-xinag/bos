package com.xr.service.impl;

import com.xr.entity.RdEntityResponsibility;
import com.xr.mapper.RdEntityResponsibilityMapper;
import com.xr.service.RdEntityResponsibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RdEntityResponsibilityServiceImpl implements RdEntityResponsibilityService {

    @Autowired
    private RdEntityResponsibilityMapper rdEntityResponsibilityMapper;

    @Override
    public List<RdEntityResponsibility> querylist(Integer page, Integer limit) {
        return rdEntityResponsibilityMapper.querylist(page, limit);
    }

    @Override
    public List<RdEntityResponsibility> pagenum() {
        return rdEntityResponsibilityMapper.pagenum();
    }

    @Override
    public List<RdEntityResponsibility> queryBytitle(String titlename, Integer page, Integer limit) {
        return rdEntityResponsibilityMapper.queryBytitle(titlename, page, limit);
    }

    @Override
    public List<RdEntityResponsibility> pageNum(String titlename) {
        return rdEntityResponsibilityMapper.pageNum(titlename);
    }

    @Override
    public void add(RdEntityResponsibility rdEntityResponsibility) {
        rdEntityResponsibilityMapper.add(rdEntityResponsibility);
    }

    @Override
    public int delete(List<Integer> list) {
        return rdEntityResponsibilityMapper.delete(list);
    }

    @Override
    public void update(RdEntityResponsibility rdEntityResponsibility) {
        rdEntityResponsibilityMapper.update(rdEntityResponsibility);
    }
}
