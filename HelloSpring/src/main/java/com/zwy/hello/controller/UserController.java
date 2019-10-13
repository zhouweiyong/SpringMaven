package com.zwy.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        HashMap<String, Object> map = new HashMap<>();

        map.put("name", "Spring");
        map.put("action", "hello");
        return map;

    }
}
