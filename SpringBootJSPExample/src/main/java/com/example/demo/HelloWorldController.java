package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String hello(Map model) {
    	model.put("message", "Hello world JSP example");
        return "helloWorld";
    }
}
 	