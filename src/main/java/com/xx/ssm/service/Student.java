package com.xx.ssm.service;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person {
    @Override
    public void say() {
        System.out.println("这是一个苦逼的程序员");
    }
}
