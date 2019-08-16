package com.funtl.spring.boot.shiro.dao;

import com.funtl.spring.boot.shiro.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findUser(User user);
}
