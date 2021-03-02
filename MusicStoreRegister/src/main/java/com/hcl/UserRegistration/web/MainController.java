package com.hcl.UserRegistration.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Capstone Project

@Controller
public class MainController {

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
}
