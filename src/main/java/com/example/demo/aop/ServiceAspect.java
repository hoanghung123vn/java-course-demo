package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class ServiceAspect {
    // 1 Aspect
    @Before("execution(* com.example.demo.aop.Service.*(..))") // Pointcut
    public void before(JoinPoint joinPoint) { // Join Point
        log.info("Before called " + joinPoint.toLongString()); // Advice
    }

    @After("execution(* com.example.demo.aop.Service.*(..))")
    public void after(JoinPoint joinPoint) {
        log.info("After called " + joinPoint.toLongString());
    }

//    @Around("execution(* com.example.demo.aop.Service.*(..))")
//    public void trackTime(ProceedingJoinPoint joinPoint) throws Throwable {
//        var start = System.currentTimeMillis();
//        log.info("Start Time Taken by {} is {}", joinPoint, start);
//
//        joinPoint.proceed();
//
//        var time = System.currentTimeMillis() - start;
//        log.info("Time taken by {} is {}", joinPoint, time);
//    }

    @Around("@annotation(com.example.demo.aop.TrackTime)")
    public void trackTime(ProceedingJoinPoint joinPoint) throws Throwable {
        var start = System.currentTimeMillis();
        log.info("Start Time Taken by {} is {}", joinPoint, start);

        joinPoint.proceed();

        var time = System.currentTimeMillis() - start;
        log.info("Time taken by {} is {}", joinPoint, time);
    }
}
