package com.xr.controller;


import com.xr.entity.RdWorkDeployment;
import com.xr.entity.RdWorkPlan;
import com.xr.service.RdWorkDeploymentService;
import com.xr.util.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("rdWorkDeployment")
public class RdWorkDeploymentController {

    @Autowired
    private RdWorkDeploymentService rdWorkDeploymentService;

    @RequestMapping("querylist")
    public ResponseResult list(Integer page, Integer limit){
        List<RdWorkDeployment> list = rdWorkDeploymentService.querylist((page - 1) * limit, limit);
        List<RdWorkDeployment> pagenum = rdWorkDeploymentService.pagenum();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pagenum.size());
        return result;
    }

    @RequestMapping("queryBytitle")
    //, Integer page, Integer limit
    public ResponseResult queryBytitlelist(String search, Integer page, Integer limit){
        List<RdWorkDeployment> list = rdWorkDeploymentService.queryBytitle(search, (page - 1) * limit, limit);
        List<RdWorkDeployment> pagenum = rdWorkDeploymentService.pageNum(search);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pagenum.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(RdWorkDeployment rdWorkDeployment){
        rdWorkDeploymentService.add(rdWorkDeployment);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(@Param("def") String def){
        List<String> result= Arrays.asList(def.split(","));
        List<Integer> list=new ArrayList<>();
        for (String s: result){
            list.add(Integer.parseInt(s));
        }
        rdWorkDeploymentService.delete(list);
        ResponseResult result1 = new ResponseResult();
        result1.getData().put("message","删除成功");
        return result1;

    }

    @RequestMapping("update")
    public ResponseResult update(RdWorkDeployment rdWorkDeployment){
        rdWorkDeploymentService.update(rdWorkDeployment);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }
}
