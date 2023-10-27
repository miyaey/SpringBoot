package com.example.fruits.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/test")
    public String test() {
        return "Git 테스트용 체인지";
    }
}
