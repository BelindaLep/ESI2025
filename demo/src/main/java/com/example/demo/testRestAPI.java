package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class testRestAPI {
    @GetMapping("/esi")
    public String helloWorld() {
        return "Welcome to the ESI course!";
    }
}
