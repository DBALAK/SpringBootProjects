package com.example.demo;
import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AynchronousController {

    @GetMapping("/")
    public Callable<String> hello() {
        return () -> {
            Thread.sleep(2000); // simulate time consuming call
            return "Hello Aynchronous Controller";
        };
    }
}     