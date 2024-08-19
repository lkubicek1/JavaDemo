package com.example.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Slf4j
@Service
public class GreetingService {
    public String greet(String name) {
        if (StringUtils.hasText(name)) {
            return "Hello, " + name + "!";
        }
        return "Hello, Spring Boot!";
    }

    @PostConstruct
    public void init() {
        log.info("**** GreetingService initialized");
    }

    @PreDestroy
    public void destroy() {
        log.info("**** GreetingService about to be destroyed");
    }
}
