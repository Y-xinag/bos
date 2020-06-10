package com.xr.service.impl;

import com.xr.entity.User;
import com.xr.mapper.UserMapper;
import com.xr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByNameAndPassword(User loginUser) {
        return userMapper.findUserByNameAndPassword(loginUser);
    }
}
