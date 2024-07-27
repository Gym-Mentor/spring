package com.example.demo.config;

import com.example.demo.component.RedisCommandComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisCommandAutoConfiguration {

    @Bean
    public RedisCommandComponent redisCommandProcessor(ApplicationContext context) {
        return new RedisCommandComponent(context);
    }
}
