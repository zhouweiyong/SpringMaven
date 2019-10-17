package com.zwy.mybatis.controller;

import com.zwy.mybatis.pojo.User;
import com.zwy.mybatis.service.UserCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 自定义mapper
 */
@RestController
@RequestMapping("/custom")
public class UserCustomController {
    @Autowired
    private UserCustomService customService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return customService.findAll();
    }
}
