package com.xr.service;

import com.xr.entity.SysLog;
import com.xr.entity.SysMechanism;

import java.util.List;

public interface SysLogService {

    List<SysLog> list();
    List<SysLog> list1(String type, String name, Integer page, Integer limit);

    //添加
    void LogAdd(SysLog sysLog);

    //修改
    void LogUpdate(SysLog sysLog);

    //删除
    void LogDelete(int id);
}
