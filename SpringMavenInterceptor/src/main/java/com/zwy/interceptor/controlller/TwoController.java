package com.zwy.interceptor.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

    @RequestMapping("/two")
    public String one() {
        return "hello two";
    }
}
