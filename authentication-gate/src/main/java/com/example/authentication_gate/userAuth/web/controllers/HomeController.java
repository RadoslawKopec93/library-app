package com.example.authentication_gate.userAuth.web.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello World secured";
    }
}
