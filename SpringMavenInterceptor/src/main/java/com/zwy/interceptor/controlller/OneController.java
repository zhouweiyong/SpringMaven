package com.zwy.interceptor.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @RequestMapping("/one")
    public String one(){
        return "hello one";
    }
}
