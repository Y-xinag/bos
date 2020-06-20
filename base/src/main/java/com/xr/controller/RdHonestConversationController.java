package com.xr.controller;

import com.xr.entity.RdHonestConversation;
import com.xr.entity.RdWorkDeployment;
import com.xr.service.RdHonestConversationService;
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
@RequestMapping("rdHonestConversation")
public class RdHonestConversationController {

    @Autowired
    private RdHonestConversationService rdHonestConversationService;

    @RequestMapping("querylist")
    public ResponseResult list(Integer page, Integer limit){
        List<RdHonestConversation> list = rdHonestConversationService.querylist((page - 1) * limit, limit);
        List<RdHonestConversation> pagenum = rdHonestConversationService.pagenum();
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pagenum.size());
        return result;
    }

    @RequestMapping("queryBytitle")
    //, Integer page, Integer limit
    public ResponseResult queryBytitlelist(String search, Integer page, Integer limit){
        List<RdHonestConversation> list = rdHonestConversationService.queryBytitle(search, (page - 1) * limit, limit);
        List<RdHonestConversation> pageNum = rdHonestConversationService.pageNum(search);
        ResponseResult result = new ResponseResult();
        result.getData().put("items",list);
        result.getData().put("total",pageNum.size());
        return result;
    }

    @RequestMapping("delete")
    public ResponseResult delete(@Param("def") String def){
        System.out.println("这是一个"+def);
        System.out.println("进入delete方法");
        List<String> result= Arrays.asList(def.split(","));
        List<Integer> list=new ArrayList<>();
        for (String s: result){
            list.add(Integer.parseInt(s));
        }
        rdHonestConversationService.delete(list);
        ResponseResult result1 = new ResponseResult();
        result1.getData().put("message","删除成功");
        return result1;

    }

    @RequestMapping("add")
    public ResponseResult add(RdHonestConversation rdHonestConversation){
        System.out.println("值"+rdHonestConversation);
        rdHonestConversationService.add(rdHonestConversation);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("update")
    public ResponseResult update(RdHonestConversation rdHonestConversation){
        System.out.println("进了update方法");
        rdHonestConversationService.update(rdHonestConversation);
        ResponseResult result = new ResponseResult();
        result.getData().put("message","修改成功");
        return result;
    }
}
