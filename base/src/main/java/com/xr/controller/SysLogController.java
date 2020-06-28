package com.xr.controller;

import com.xr.entity.SysLog;
import com.xr.service.SysLogService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("log")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("list")
    @RequiresPermissions("log:list")
    public ResponseResult list(SysLog sysLog, Integer page, Integer limit){
        ResponseResult result = new ResponseResult();
        List<SysLog> sysLogs = sysLogService.list1(sysLog.getType(), sysLog.getTitle(), (page-1)*limit, limit);
        List<SysLog> sysLogs1 = sysLogService.list();
        result.getData().put("items",sysLogs);
        result.getData().put("total",sysLogs1.size());
        /*if(sysLog.getType() == null && sysLog.getTitle() == null){
            result.getData().put("total",sysLogs1.size());
        }else {
            result.getData().put("total",sysLogs.size());
        }*/
        return result;
    }


    /*@RequestMapping("add")
    @RequiresPermissions("log:add")
    public ResponseResult add(SysLog sysLog){
        ResponseResult result = new ResponseResult();
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("log:update")
    public ResponseResult update(SysLog sysLog){
        ResponseResult result = new ResponseResult();
        return result;
    }*/

    @RequestMapping("delete")
    @RequiresPermissions("log:delete")
    public ResponseResult delete(Integer id){
        ResponseResult result = new ResponseResult();
        sysLogService.LogDelete(id);
        return result;
    }
}
