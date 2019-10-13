package com.zwy.configuration.controller;

import com.zwy.configuration.pojo.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    private Config config;
    @RequestMapping("show")
    public Config show(){
        Config cf =new Config();
        cf.setName(config.getName());
        cf.setWebsite(config.getWebsite());
        cf.setLanguage(config.getLanguage());
        return cf;
    }
}
