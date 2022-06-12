package com.xx.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class B {

    @Autowired
    private A a;

    @Transactional
    public String doMethodB() {
        return "invoke method B";
    }
}
