package com.dafang.service.demo;

import com.dafang.service.demo.iface.IBusinessService;
import org.springframework.stereotype.Service;

public class BusinessService implements IBusinessService {

    public BusinessService() {
        System.out.println("BusinessService.init()!!!!");
    }

    public void show() {
        System.out.println("BusinessService.show()!!!");
    }
}
