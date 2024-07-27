package com.example.demo.component;

import com.example.demo.annotation.RedisCommand;
import com.example.demo.annotation.RedisController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Component
public class RedisCommandComponent {

    private final Map<String, Method> commandMethodMap = new HashMap<>();
    private final Map<String, Object> controllerMap = new HashMap<>();

    @Autowired
    public RedisCommandComponent(ApplicationContext context) {
        String[] beanNames = context.getBeanNamesForAnnotation(RedisController.class);
        for (String beanName : beanNames) {
            Object bean = context.getBean(beanName);
            Class<?> clazz = bean.getClass();

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(RedisCommand.class)) {
                    RedisCommand commandAnnotation = method.getAnnotation(RedisCommand.class);
                    commandMethodMap.put(commandAnnotation.command(), method);
                    controllerMap.put(commandAnnotation.command(), bean);
                }
            }
        }
    }

    public Object processCommand(String command, Object... args) throws Exception {
        Method method = commandMethodMap.get(command);
        if (method == null) {
            throw new IllegalArgumentException("No command found for: " + command);
        }
        Object controller = controllerMap.get(command);
        return method.invoke(controller, args);
    }
}
