package com.example.sanitation_system;

import com.example.sanitation_system.interceptor.DirectorInterceptor;
import com.example.sanitation_system.interceptor.HeadInterceptor;
import com.example.sanitation_system.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor li;
    @Autowired
    private HeadInterceptor hi;
    @Autowired
    private DirectorInterceptor di;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(li)
                .addPathPatterns("/api/**")
                .excludePathPatterns("/api/login");
        registry.addInterceptor(hi)
                .addPathPatterns("/api/head");
        registry.addInterceptor(di)
                .addPathPatterns("/api/director");
    }
}
