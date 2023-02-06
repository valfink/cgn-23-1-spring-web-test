package com.example.springwebtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloSpringController {
    @GetMapping("/hello-spring")
    public String helloSpring() {
        return "Hello Spring!";
    }
}
