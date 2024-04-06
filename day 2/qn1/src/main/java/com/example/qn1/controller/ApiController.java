package com.example.qn1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.qn1.config.AppConfig;

public class ApiController {
    @Autowired
    AppConfig a;
    @GetMapping("/info")
    public String message()
    {
        return "App Name:" + a.getAppName()+"Version:"+a.getAppVersion();
    }

}
