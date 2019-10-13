package com.zwy.jsp.controller;

import com.zwy.jsp.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class UserController {

    @RequestMapping("/show")
    public String show(Model model) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "张三", 20));
        list.add(new User(2, "李四", 26));
        list.add(new User(3, "王五", 30));
        model.addAttribute("list", list);
        return "user";
    }

}
