package com.example.demo.ctrlr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrlr {

    @RequestMapping("/hello")
    public String greet(){
        return "Hello stranger!";
    }
}
