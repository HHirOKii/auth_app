package com.example.auth_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {

    @GetMapping("/")
    public String root() {
        return "redirect:/top";
    }

    @GetMapping("/top")
    public String top() {
        return "top";
    }
}
