package com.example.demo.controller;

import com.example.demo.annotation.RedisCommand;
import com.example.demo.annotation.RedisController;
import org.springframework.stereotype.Controller;

@RedisController
@Controller
public class MyRedisController {

    @RedisCommand(command = "helloWorld")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @RedisCommand(command = "addNumbers")
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
