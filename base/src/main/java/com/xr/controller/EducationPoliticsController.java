package com.xr.controller;

import com.xr.entity.EducationPolitics;
import com.xr.entity.SysLog;
import com.xr.service.EducationPoliticsService;
import com.xr.util.ResponseResult;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("educationPolitics")
public class EducationPoliticsController {
    @Autowired
    private EducationPoliticsService educationPoliticsService;

    @RequestMapping("list")
    @RequiresPermissions("educationPolitics:list")
    public ResponseResult list(EducationPolitics educationPolitics, Integer page, Integer limit){
        ResponseResult result = new ResponseResult();
        List<EducationPolitics> sysMechanisms = educationPoliticsService.list1(educationPolitics.getTitle(), (page-1)*limit, limit);
        List<EducationPolitics> sysMechanisms1 = educationPoliticsService.list();
        result.getData().put("items",sysMechanisms);
        result.getData().put("total",sysMechanisms1.size());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("educationPolitics:add")
    public ResponseResult add(EducationPolitics educationPolitics){
        ResponseResult result = new ResponseResult();
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        educationPolitics.setCreateTime(time);
        //默认正常
        educationPolitics.setStaus("正常");
        educationPoliticsService.EducationPoliticsAdd(educationPolitics);
        //System.out.println(educationPolitics.toString());
        result.getData().put("message","新增成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("educationPolitics:update")
    public ResponseResult update(EducationPolitics educationPolitics){
        ResponseResult result = new ResponseResult();
        educationPoliticsService.EducationPoliticsUpdate(educationPolitics);
        //System.out.println(educationPolitics.toString());
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("educationPolitics:delete")
    public ResponseResult delete(Integer id){
        ResponseResult result = new ResponseResult();
        educationPoliticsService.EducationPoliticsDelete(id);
        //System.out.println("删除的id："+id);
        result.getData().put("message","删除成功");
        return result;
    }
}
