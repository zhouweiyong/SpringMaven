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
    public Object findAll() {
        List<User> list = service.getAll();
        return list;
    }

    @RequestMapping("/getOne")
    public User findOne(int id) {
        return service.getUser(id);
    }

    @RequestMapping("/insert")
    public String insert() {
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setName("jack" + i);
            user.setAge(20 + i);
            service.insert(user);
        }
        return "insert success!";
    }

    @RequestMapping("/update")
    public void update() {
        User user = service.getUser(2);
        user.setName("jackkk");
        user.setAge(39);
        service.update(user);
    }

    @RequestMapping("/addOne")
    public void addOne(){
        User user = new User();
        user.setAge(18);
        user.setName("Enzo");
        service.add(user);
    }

}
