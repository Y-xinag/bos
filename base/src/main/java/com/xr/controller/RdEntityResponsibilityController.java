package com.xr.controller;

import com.xr.entity.RdEntityResponsibility;
import com.xr.service.RdEntityResponsibilityService;
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
@RequestMapping("rdEntityResponsibility")
public class RdEntityResponsibilityController {
    
    @Autowired
    private RdEntityResponsibilityService rdEntityResponsibilityService;

    @RequestMapping("querylist")
    public ResponseResult list(Integer page, Integer limit){
        List<RdEntityResponsibility> list = rdEntityResponsibilityService.querylist((page - 1) * limit, limit);
        List<RdEntityResponsibility> pagenum = rdEntityResponsibilityService.pagenum();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pagenum.size());
        return result;
    }

    @RequestMapping("queryBytitle")
    //, Integer page, Integer limit
    public ResponseResult queryBytitlelist(String search, Integer page, Integer limit){
        List<RdEntityResponsibility> list = rdEntityResponsibilityService.queryBytitle(search, (page - 1) * limit, limit);
        List<RdEntityResponsibility> pagenum = rdEntityResponsibilityService.pageNum(search);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pagenum.size());
        return result;
    }

    @RequestMapping("add")
    public ResponseResult add(RdEntityResponsibility rdEntityResponsibility){
        rdEntityResponsibilityService.add(rdEntityResponsibility);
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
        rdEntityResponsibilityService.delete(list);
        ResponseResult result1 = new ResponseResult();
        result1.getData().put("message","删除成功");
        return result1;

    }

    @RequestMapping("update")
    public ResponseResult update(RdEntityResponsibility rdEntityResponsibility){
        rdEntityResponsibilityService.update(rdEntityResponsibility);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }
}
