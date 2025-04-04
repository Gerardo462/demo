package com.example.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/v1")
    public String hello() {
        return "¡Proyecto funcionando!";
    }
}

