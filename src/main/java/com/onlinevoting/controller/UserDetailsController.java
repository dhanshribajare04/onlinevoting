package com.onlinevoting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/user")
public class UserDetailsController {

    @GetMapping("/v1/data")
    public String getData(){
        return "Dhanshri";
    }
}

