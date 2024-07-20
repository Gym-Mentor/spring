package com.example.demo.config;

import com.example.demo.annotation.RedisController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

public class CustomRequestMappingHandlerMapping extends RequestMappingHandlerMapping {

    @Override
    protected boolean isHandler(Class<?> beanType) {
        return beanType.isAnnotationPresent(RedisController.class) || super.isHandler(beanType);
    }
}
