package com.example.demo.annotation;

import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

@Service
public class CustomerProcessor {

    public void initProcessor(Object object) throws InvocationTargetException, IllegalAccessException {
        if (Objects.isNull(object)) {
            return;
        }
        var clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Init.class)){
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }
}
