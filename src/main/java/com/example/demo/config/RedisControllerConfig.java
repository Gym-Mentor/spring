package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class RedisControllerConfig {

    @Bean
    public RequestMappingHandlerMapping customRequestMappingHandlerMapping() {
        return new CustomRequestMappingHandlerMapping();
    }
}
