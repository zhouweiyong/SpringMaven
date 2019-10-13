package com.zwy.json.controller;

import com.zwy.json.pojo.Result;
import com.zwy.json.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("jack222");
        user.setPassword("12345");
        user.setAge(25);
        user.setBirthday(new Date());
        user.setDesc("hello spring");
        return user;
    }

    @RequestMapping("/getResult")
    public Result getResult(){
        Result rs =new Result();
        User user = new User();
        user.setName("Enzo");
        user.setPassword("12345");
        user.setAge(25);
        user.setBirthday(new Date());
        user.setDesc("hello spring");

        rs.setCode(200);
        rs.setMsg("success");
        rs.setRs(user);
        return  rs;
    }
}
