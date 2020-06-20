package com.xr.service.impl;

import com.xr.entity.RdWorkPlan;
import com.xr.mapper.RdWorkPlanMapper;
import com.xr.service.RdWorkPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RdWorkPlanServiceImpl implements RdWorkPlanService {

    @Autowired
    private RdWorkPlanMapper rdWorkPlanMapper;


    @Override
    public List<RdWorkPlan> querylist(Integer page, Integer limit) {
        return rdWorkPlanMapper.querylist(page,limit);
    }

    @Override
    public List<RdWorkPlan> pageNum() {
        return rdWorkPlanMapper.pageNum();
    }

    @Override
    public List<RdWorkPlan> queryBytitle(String titlename, Integer page, Integer limit) {
        return rdWorkPlanMapper.queryBytitle(titlename, page, limit);
    }

    @Override
    public List<RdWorkPlan> pagenum(String titlename) {
        return rdWorkPlanMapper.pagenum(titlename);
    }

    @Override
    public void add(RdWorkPlan rdWorkPlan) {
        rdWorkPlanMapper.add(rdWorkPlan);
    }

    @Override
    public int delete(List<Integer> list) {
        return rdWorkPlanMapper.delete(list);
    }

    @Override
    public void update(RdWorkPlan rdWorkPlan) {
        rdWorkPlanMapper.update(rdWorkPlan);
    }

    @Override
    public RdWorkPlan queryById(Integer id) {
        return rdWorkPlanMapper.queryById(id);
    }
}
