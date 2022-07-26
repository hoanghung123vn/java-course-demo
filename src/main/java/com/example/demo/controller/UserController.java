package com.example.demo.controller;

import com.example.demo.aop.Service;
import com.example.demo.hibernate_validator.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private final Service service;

    @PostMapping
    public String create(@Valid @RequestBody User user) {
        return "created";
    }

    @GetMapping("/test")
    public String test() {
        service.test();
        return "test";
    }

    @GetMapping("/tracktime")
    public String tracktime() throws InterruptedException {
        service.tracktime();
        return "test";
    }
}
