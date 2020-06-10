package com.xr.controller;

import com.xr.entity.User;
import com.xr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService usersService;

    @RequestMapping("login")
    public ResponseEntity<Map<String,Object>> login(@RequestBody User user){
        System.out.println("传入的："+user);
        User loginUser = usersService.findUserByNameAndPassword(user);
        System.out.println(loginUser);
        Map<String,Object> map = new HashMap<>();
        if (loginUser!=null){
            map.put("msg","登录成功");
            map.put("loginUser",loginUser);
            return ResponseEntity.status(HttpStatus.OK).body(map);
        }else {
            map.put("msg","登录失败，用户名或密码错误");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
        }
    }
}
