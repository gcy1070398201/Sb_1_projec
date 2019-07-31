package com.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {
    @GetMapping(value = "/hello")
    public String hell(){
       return "hello Spring Boot...";
    }
}
