package com.xr.service.impl;

import com.xr.entity.RdWorkDeployment;
import com.xr.mapper.RdWorkDeploymentMapper;
import com.xr.service.RdWorkDeploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RdWorkDeploymentServiceImpl implements RdWorkDeploymentService {

    @Autowired
    private RdWorkDeploymentMapper rdWorkDeploymentMapper;


    @Override
    public List<RdWorkDeployment> querylist(Integer page, Integer limit) {
        return rdWorkDeploymentMapper.querylist(page,limit);
    }

    @Override
    public List<RdWorkDeployment> pagenum() {
        return rdWorkDeploymentMapper.pagenum();
    }

    @Override
    public List<RdWorkDeployment> queryBytitle(String titlename, Integer page, Integer limit) {
        return rdWorkDeploymentMapper.queryBytitle(titlename, page, limit);
    }

    @Override
    public List<RdWorkDeployment> pageNum(String titlename) {
        return rdWorkDeploymentMapper.pageNum(titlename);
    }

    @Override
    public void add(RdWorkDeployment rdWorkDeployment) {
        rdWorkDeploymentMapper.add(rdWorkDeployment);
    }

    @Override
    public int delete(List<Integer> list) {
        return rdWorkDeploymentMapper.delete(list);
    }

    @Override
    public void update(RdWorkDeployment rdWorkDeployment) {
        rdWorkDeploymentMapper.update(rdWorkDeployment);
    }
}
