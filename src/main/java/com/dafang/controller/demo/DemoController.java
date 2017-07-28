package com.dafang.controller.demo;

import com.dafang.service.demo.DemoService;
import com.dafang.service.demo.iface.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/wx/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Autowired
    private IBusinessService businessService;

    @RequestMapping("/show/pig")
    public String showPig(){
        demoService.showSomething();
        return "welcome";
    }

    @RequestMapping("/show/show")
    public String showShow(){
        businessService.show();
        return "welcome";
    }


    @RequestMapping("/show/something")
    public String showSomething() {
        demoService.showSomething("demoController");
        return "welcome";
    }

}


