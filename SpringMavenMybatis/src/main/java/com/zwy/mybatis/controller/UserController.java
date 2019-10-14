package com.zwy.mybatis.controller;

import com.zwy.mybatis.pojo.User;
import com.zwy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/all")
    public Object findAll(){
       List<User> list = service.getAll();
       return list;
    }
}
