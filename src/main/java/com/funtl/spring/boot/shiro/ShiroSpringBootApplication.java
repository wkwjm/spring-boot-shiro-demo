package com.funtl.spring.boot.shiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.funtl.spring.boot.shiro.dao")
public class ShiroSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShiroSpringBootApplication.class,args);
    }
}
