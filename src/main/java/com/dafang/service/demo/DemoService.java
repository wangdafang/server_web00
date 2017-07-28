package com.dafang.service.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {


    public void showSystenOut() {
        this.showSomething();
    }

    public void showSomething() {
        System.out.println("pig");
    }
    public void showSomething(String something) {
        System.out.printf("来自于"+something+"的something");
    }



}
