package com.owen.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration
public class MyDemoApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(MyDemoApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 在这里添加请求转发的规则
        registry.addViewController("/forward").setViewName("forward:/hello");
    }
}