package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

@Slf4j
@SpringBootApplication
public class Application {

    private static final Set<String> CUSTOM_BEAN_NAMES = Set.of(
            "application",
            "greetingService",
            "helloController",
            "myAwesomeCustomBean",
            "customBean2"
    );

    private final ApplicationContext applicationContext;

    @Autowired
    public Application(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {

            String[] beanNames = applicationContext.getBeanDefinitionNames();
            Function<String, String> beanNameToClassName = beanName -> beanName + " : " + applicationContext.getBean(beanName).getClass().getName();

            log.info("**** Inspecting beans managed by Spring Boot:\n");
            Stream.of(beanNames).filter(beanName -> !CUSTOM_BEAN_NAMES.contains(beanName))
                    .map(beanNameToClassName)
                    .forEach(log::info);

            log.info("**** Inspecting custom beans managed by Spring Boot:\n");
            Stream.of(beanNames)
                    .filter(CUSTOM_BEAN_NAMES::contains)
                    .map(beanNameToClassName)
                    .forEach(log::info);
        };
    }
}
