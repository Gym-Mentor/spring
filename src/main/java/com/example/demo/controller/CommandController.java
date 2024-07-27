package com.example.demo.controller;

import com.example.demo.component.RedisCommandComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CommandController {

    @Autowired
    private RedisCommandComponent redisCommandComponent;

    @PostMapping("/execute")
    public Object executeCommand(@RequestBody Map<String, Object> request) {
        String command = (String) request.get("command");
        Object[] args = ((List<Object>) request.get("args")).toArray();

        try {
            return redisCommandComponent.processCommand(command, args);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
