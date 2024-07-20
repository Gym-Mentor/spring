package com.example.demo.controller;

import com.example.demo.annotation.RedisController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RedisController
public class CustomController {

    @GetMapping("/redis")
    @ResponseBody
    public String redisGet(String key, String message) {
        return String.format("key : %s, message : %s", key, message);
    }

}
