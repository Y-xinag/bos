package com.xr.mapper;

import com.xr.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select id,name,wapp,sex from user where name=#{name} and wapp=#{wapp}")
    public User findUserByNameAndPassword(User loginUser);
}
