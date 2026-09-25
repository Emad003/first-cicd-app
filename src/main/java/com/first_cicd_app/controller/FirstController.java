package com.first_cicd_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/message")
    public String getMessage() {
        return "Your app is working";
    }
}
