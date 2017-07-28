package com.dafang.controller.demo;

import com.dafang.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/wx/server")
public class ServerController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/show/pig")
    public String showPig(){
        demoService.showSomething();
        return "welcome";
    }


    @RequestMapping("/show/something")
    public String showSomething() {
        demoService.showSomething("serverController");
        return "welcome";
    }

}


