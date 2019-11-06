package com.zwy.interceptor.config;

import com.zwy.interceptor.interceptor.OneInterceptor;
import com.zwy.interceptor.interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new OneInterceptor())
                .addPathPatterns("/*/**");

        registry.addInterceptor(new TwoInterceptor())
                .addPathPatterns("/two/**")
                .addPathPatterns("/one/**");

        super.addInterceptors(registry);
    }
}
