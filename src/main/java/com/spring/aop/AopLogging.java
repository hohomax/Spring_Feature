package com.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AopLogging {

    @Before("execution(* com.spring.aop.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.info("Before: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.spring.aop.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        log.info("after: " + joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.spring.aop.*.*(..))")
    public void logAfterReturning(JoinPoint joinPoint) {
        log.info("AfterReturning: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution(* com.spring.aop.*.*(..))")
    public void AfterThrowing(JoinPoint joinPoint) {
        log.info("AfterReturning: " + joinPoint.getSignature().getName());
    }


}
