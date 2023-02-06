package com.example.springwebtest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloSpringController {
    @GetMapping("/hello-spring")
    public String helloSpring() {
        return "Hello Spring!";
    }

    @GetMapping("hello/{name}")
    public String helloUser(@PathVariable String name) {
        return "Hello, " + name;
    }

    @PostMapping("new-data")
    public String postHandler(@RequestBody String newData) {
        return "You posted: " + newData + "\nLength is: " + newData.length();
    }

    @PutMapping("edit-data")
    public void putHandler(@RequestBody String editedData) {
        // handle edited data
    }
}
