package com.zwy.filter;

import com.zwy.filter.filter.SecondFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot整合Filter方式二
 */
@SpringBootApplication
@ServletComponentScan
public class MainApp2 {

    public static void main(String[] args) {
        SpringApplication.run(MainApp2.class, args);
    }

    @Bean
    public FilterRegistrationBean getFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        bean.addUrlPatterns("/first");
        return bean;
    }
}
