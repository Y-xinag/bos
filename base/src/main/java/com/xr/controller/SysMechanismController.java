package com.xr.controller;

import com.xr.entity.SysMechanism;
import com.xr.service.SysMechanismService;
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
@RequestMapping("mechanism")
public class SysMechanismController {
    @Autowired
    private SysMechanismService sysMechanismService;

    @RequestMapping("groupMechanism")
    //@RequiresPermissions("mechanism:group")
    public ResponseResult groupMechanism(){
        ResponseResult result = new ResponseResult();
        List<SysMechanism> sysMechanisms = sysMechanismService.groupMechanism();
        result.getData().put("mechanismList", sysMechanisms);
        return result;
    }

    @RequestMapping("list")
    @RequiresPermissions("mechanism:list")
    public ResponseResult list(SysMechanism sysMechanism, Integer page,Integer limit){
        ResponseResult result = new ResponseResult();
        List<SysMechanism> sysMechanisms = sysMechanismService.MechanismList(sysMechanism.getMechanismName(), (page-1)*limit, limit);
        System.out.println(sysMechanisms.toString());
        List<SysMechanism> sysMechanisms1 = sysMechanismService.MechanismSize();
        result.getData().put("items",sysMechanisms);
        result.getData().put("total",sysMechanisms1.size());
        return result;
    }

    @RequestMapping("add")
    @RequiresPermissions("mechanism:add")
    public ResponseResult add(SysMechanism sysMechanism){
        ResponseResult result = new ResponseResult();
        //获取系统当前时间
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time=null;
        try {
            time=sdf.parse(sdf.format(new Date()));
        }catch (ParseException e){
            e.printStackTrace();
        }
        sysMechanism.setCreateTime(time);
        //默认正常
        sysMechanism.setStaus("正常");
        //System.out.println("add："+sysMechanism);
        sysMechanismService.MechanismAdd(sysMechanism);
        result.getData().put("message","添加成功");
        return result;
    }

    @RequestMapping("delete")
    @RequiresPermissions("mechanism:delete")
    public ResponseResult delete(Integer mid){
        ResponseResult result = new ResponseResult();
        //System.out.println("delete:"+mid);
        sysMechanismService.MechanismDelete(mid);
        result.getData().put("message","删除成功");
        return result;
    }

    @RequestMapping("update")
    @RequiresPermissions("mechanism:update")
    public ResponseResult update(SysMechanism sysMechanism){
        ResponseResult result = new ResponseResult();
        //sysMechanism.setSysStaff(null);
        System.out.println("update:"+sysMechanism);
        result.getData().put("message","修改成功");
        return result;
    }

}
