package com.xr.controller;

import com.xr.entity.RdWorkPlan;
import com.xr.entity.Riskpointwarning;
import com.xr.service.RiskpointwarningService;
import com.xr.util.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("riskpointwarning")
public class RiskpointwarningController {

    @Autowired
    private RiskpointwarningService riskpointwarningService;

    @RequestMapping("querylist")
    //, Integer page, Integer limit
    public ResponseResult list(Integer page, Integer limit){
        List<Riskpointwarning> list = riskpointwarningService.querylist((page - 1) * limit, limit);
        List<Riskpointwarning> pageNum = riskpointwarningService.pagenum();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pageNum.size());
        return result;
    }


    @RequestMapping("queryBytitle")
    //, Integer page, Integer limit
    public ResponseResult queryBytitlelist(String search, Integer page, Integer limit){
        List<Riskpointwarning> list = riskpointwarningService.queryBytitle(search, (page - 1) * limit, limit);
        List<Riskpointwarning> pagenum = riskpointwarningService.pageNum(search);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pagenum.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(Riskpointwarning riskpointwarning){
        riskpointwarningService.add(riskpointwarning);
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
        riskpointwarningService.delete(list);
        ResponseResult result1 = new ResponseResult();
        result1.getData().put("message","删除成功");
        return result1;

    }

    @RequestMapping("update")
    public ResponseResult update(Riskpointwarning riskpointwarning){
        riskpointwarningService.update(riskpointwarning);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }
}
