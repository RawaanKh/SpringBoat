package com.example.spring2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
    @GetMapping("/name")
    public String getMessage1(){
        return "My name is Rawan";
    }
    @GetMapping("/age")
    public String getMessage2(){
        return "My age is 20";
    }
    @GetMapping("/check")
    public String getMessage3(){
        return "Everything is OK";
    }
    @GetMapping("/health")
    public String getMessage4(){
        return "Server health is up and running";
    }
}
