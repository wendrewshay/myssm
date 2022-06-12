package com.xx.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class A {

    @Autowired
    private B b;

    @Transactional
    public String doMethodA() {
        b.doMethodB();
        return "invoke method A";
    }
}
