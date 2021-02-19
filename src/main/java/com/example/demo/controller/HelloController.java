package com.example.demo.controller;

import com.example.demo.Service.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UmsService umsService;

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/test")
    public String datatest(){
        return umsService.selectIds();
    }

}
