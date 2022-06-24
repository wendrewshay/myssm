package com.xx.ssm.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJTest {

    @Pointcut("execution(* *.say(..))")
    public void test() {}

    @Before("test()")
    public void doMyBefore() {
        System.out.println("before test..");
    }

    @After("test()")
    public void doMyAfter() {
        System.out.println("after test..");
    }

    @Around("test()")
    public Object doMyAround(ProceedingJoinPoint p) {
        System.out.println("around--before..");
        Object o = null;
        try {
            o = p.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around--after..");
        return o;
    }

    @AfterReturning("test()")
    public void doMyAfterReturning() {
        System.out.println("after returning..");
    }

}
