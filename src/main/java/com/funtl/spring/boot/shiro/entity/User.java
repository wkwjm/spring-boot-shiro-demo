package com.funtl.spring.boot.shiro.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String perms;
}
