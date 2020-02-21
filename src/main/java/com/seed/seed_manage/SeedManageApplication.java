package com.seed.seed_manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SeedManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeedManageApplication.class, args);
    }

    /**
     * 添加对jsp支持
     *
     */
    @Bean
    public ViewResolver getJspViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");//前缀
        internalResourceViewResolver.setSuffix(".jsp");//后缀
        internalResourceViewResolver.setOrder(0);//优先级
        return internalResourceViewResolver;
    }
}
