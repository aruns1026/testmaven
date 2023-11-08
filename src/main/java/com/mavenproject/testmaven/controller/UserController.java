package com.mavenproject.testmaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/welcome")
    public String message() {
        return "Welcome to the User Page in the settings...";
    }
}
