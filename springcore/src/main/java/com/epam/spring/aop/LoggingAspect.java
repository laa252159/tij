package com.epam.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    @Pointcut("execution(* com.epam.spring.core.ConsoleEventLogger.logEvent(..))")
    private  void allLogEventMethods(){

    }

    @Before("allLogEventMethods()")
    public void logBefore(JoinPoint joinPoint){
        String msg = "BEFORE: " + joinPoint.getTarget().getClass().getSimpleName() + " " + joinPoint.getSignature().getName();
        System.out.println(msg);
    }

    @AfterReturning(pointcut = "allLogEventMethods()", returning = "retVal")
    public void logAfter(Object retVal){
        String msg = "Returned value: " + retVal;
        System.out.println(msg);
    }

}
