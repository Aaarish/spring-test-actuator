package com.example.springtestactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping(name = "/test")
    public String test(){
        return "Testing...";
    }

    @PostMapping(name = "/test")
    public String add(){
        return "Adding something...";
    }
}
