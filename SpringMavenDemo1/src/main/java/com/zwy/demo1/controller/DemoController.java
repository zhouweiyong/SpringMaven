package com.zwy.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/show")
    public String show(){
        return "Hello Spring....";
    }

}
