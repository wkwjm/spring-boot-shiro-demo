package com.funtl.spring.boot.shiro.service;

import com.funtl.spring.boot.shiro.dao.UserMapper;
import com.funtl.spring.boot.shiro.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUser(User user){
        return userMapper.findUser(user);
    }

}
