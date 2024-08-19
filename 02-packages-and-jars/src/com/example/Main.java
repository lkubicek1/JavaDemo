package com.example;

import com.example.utils.GreetingUtil;

public class Main {
    public static void main(String[] args) {
        String environment = System.getProperty("env", "prod");
        System.out.println("Running in environment: " + environment);
        if (args.length == 0) {
            GreetingUtil.greet("Java Developer");
        } else {
            GreetingUtil.greet(args[0]);
        }
    }
}
