package com.zwy.freemarker.controller;

import com.zwy.freemarker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/show")
    public String show(Model model){
        User user = new User();
        user.setName("Enzo");
        user.setAge(29);
        model.addAttribute("user",user);
        return "index";
    }

    @RequestMapping("/show2")
    public String show2(ModelMap map){
        User user = new User();
        user.setName("Enzo");
        user.setAge(29);
        map.addAttribute("user",user);
        return "/user/show";
    }
}
