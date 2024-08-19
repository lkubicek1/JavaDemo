package com.example;

import com.example.utils.GreetingUtil;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            GreetingUtil.greet("Java Developer");
        } else {
            GreetingUtil.greet(args[0]);
        }
    }
}
