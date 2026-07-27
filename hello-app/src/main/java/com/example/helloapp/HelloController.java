package com.example.helloapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello from DevOps Project!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application Running";
    }
}