package com.slxsm.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class Log {

    @Before("execution(* com.slxsm.aop.dao..*.*(..))")
    public void beforeLog(){
        System.out.println("=====beforeLog=====");
    }

    @After("execution(* com.slxsm.aop.dao..*.*(..))")
    public void afterLog(JoinPoint point){
        System.out.println("=====afterLog=====");
        System.out.println("method = " + point.getSignature().getName() + " args = " + Arrays.asList(point.getArgs()));
    }

    @AfterReturning("execution(* com.slxsm.aop.dao..*.*(..))")
    public void afterReturn(JoinPoint point){
        System.out.println("=======@AfterReturning========");
        System.out.println(point.toString());
    }
}
