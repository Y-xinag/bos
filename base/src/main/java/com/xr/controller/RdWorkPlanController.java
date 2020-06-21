package com.xr.controller;


import com.xr.entity.RdWorkPlan;
import com.xr.service.RdWorkPlanService;
import com.xr.util.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("rdWorkPlan")
public class RdWorkPlanController {
    @Autowired
    private RdWorkPlanService rdWorkPlanService;

    @RequestMapping("querylist")
    //, Integer page, Integer limit
    public ResponseResult list(Integer page, Integer limit){
        List<RdWorkPlan> list = rdWorkPlanService.querylist((page - 1) * limit, limit);
        List<RdWorkPlan> pageNum = rdWorkPlanService.pageNum();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pageNum.size());
        return result;
    }


    @RequestMapping("queryBytitle")
    //, Integer page, Integer limit
    public ResponseResult queryBytitlelist(String search, Integer page, Integer limit){
        List<RdWorkPlan> list = rdWorkPlanService.queryBytitle(search,(page - 1) * limit, limit);
        List<RdWorkPlan> pagenum = rdWorkPlanService.pagenum(search);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pagenum.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(RdWorkPlan rdWorkPlan){
        rdWorkPlanService.add(rdWorkPlan);
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
        rdWorkPlanService.delete(list);
        ResponseResult result1 = new ResponseResult();
        result1.getData().put("message","删除成功");
        return result1;

    }

    @RequestMapping("update")
    public ResponseResult update(RdWorkPlan rdWorkPlan){
        rdWorkPlanService.update(rdWorkPlan);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }
}
