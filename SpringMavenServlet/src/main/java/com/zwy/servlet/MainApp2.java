package com.zwy.servlet;

import com.zwy.servlet.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApp2 {

    public static void main(String[] args) {
        SpringApplication.run(MainApp2.class,args);
    }

    @Bean
    public ServletRegistrationBean getServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
}
