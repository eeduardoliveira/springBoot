package com.eduardodev.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // notação basica para string
public class HelloController {

    @GetMapping("/")
    public String helloMessage(){
        return "Hello, World - at Belem brazil";
    }
}
