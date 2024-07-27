package com.example.demo.handler;


import com.example.demo.annotation.RedisCommand;
import com.example.demo.annotation.RedisController;

@RedisController
public class RedisCommandHandler {

    @RedisCommand(command = "set")
    public String set(String key, String value) {
        // Redis set command logic
        return "Set command executed with key: " + key + " and value: " + value;
    }

    @RedisCommand(command = "get")
    public String get(String key) {
        // Redis get command logic
        return "Get command executed with key: " + key;
    }
}
