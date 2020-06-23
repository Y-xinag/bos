package com.xr.controller;

import com.xr.entity.EducationPolitics;
import com.xr.entity.SysMechanism;
import com.xr.entity.SysPost;
import com.xr.entity.SysStaff;
import com.xr.service.SysPostService;
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
@RequestMapping("post")
public class SysPostController {
    @Autowired
    private SysPostService sysPostService;

    @RequestMapping("group")
    public ResponseResult groupStaff(){
        List<SysPost> list = sysPostService.list();
        ResponseResult result = new ResponseResult();
        result.getData().put("postList",list);
        return result;
    }

    @RequestMapping("list")
    @RequiresPermissions("post:list")
    public ResponseResult list(SysPost sysPost, Integer page, Integer limit){
        ResponseResult result = new ResponseResult();
        List<SysPost> syslist1 = sysPostService.list1(sysPost.getPname(), (page-1)*limit, limit);
        List<SysPost> syslist = sysPostService.list();
        result.getData().put("items",syslist1);
        result.getData().put("total",syslist.size());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("post:add")
    public ResponseResult add(SysPost sysPost){
        ResponseResult result = new ResponseResult();
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        sysPost.setCreateTime(time);
        //默认正常
        sysPost.setStaus("正常");
        //System.out.println(sysPost);
        sysPostService.PostAdd(sysPost);
        result.getData().put("message","新增成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("post:update")
    public ResponseResult update(SysPost sysPost){
        ResponseResult result = new ResponseResult();
        //System.out.println(sysPost);
        sysPostService.PostUpdate(sysPost);
        result.getData().put("message","修改成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("post:delete")
    public ResponseResult delete(Integer pid){
        ResponseResult result = new ResponseResult();
        sysPostService.PostDelete(pid);
        result.getData().put("message","删除成功");
        return result;
    }
}
