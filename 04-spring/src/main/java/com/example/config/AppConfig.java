package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "myAwesomeCustomBean")
    public String customBean() {
        return "This bean is awesome!";
    }

    @Bean
    public String customBean2() {
        return "This is a regular bean";
    }
}
