package com.xr.service.impl;

import com.xr.entity.SysLog;
import com.xr.entity.SysMechanism;
import com.xr.mapper.SysLogMapper;
import com.xr.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public List<SysLog> list() {
        return sysLogMapper.list();
    }

    @Override
    public List<SysLog> list1(String name, Integer page, Integer limit) {
        List<SysLog> sysLogs = sysLogMapper.list1(name, page, limit);
        return sysLogs;
    }

    @Override
    public void LogAdd(SysLog sysLog) {
        sysLogMapper.insertSelective(sysLog);
    }

    @Override
    public void LogUpdate(SysLog sysLog) {
        sysLogMapper.updateByPrimaryKeySelective(sysLog);
    }

    @Override
    public void LogDelete(int id) {
        sysLogMapper.deleteByPrimaryKey(id);
    }
}
