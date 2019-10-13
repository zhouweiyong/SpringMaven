package com.zwy.listener;

import com.zwy.listener.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class MainApp2 {

    public static void main(String[] args) {
        SpringApplication.run(MainApp2.class, args);
    }

    @Bean
    public ServletListenerRegistrationBean getListener(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }
}
