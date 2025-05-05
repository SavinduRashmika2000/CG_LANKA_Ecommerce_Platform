package com.Ecommerce.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user {
    @GetMapping("/hellow")
    public String hellow(){
        return "hellow";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}
