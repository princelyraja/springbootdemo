package com.example.walmart.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbdemo")
public class SBDemoController {

    @GetMapping("/hello")
    public String welcomeSb() {
        return "Hello World!!";
    }
}
