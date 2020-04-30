package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AynchronousControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AynchronousControllerApplication.class, args);
    }
    
    //When u run this application, in a console log  u will see a new thread is being created like this "some name-exec-1".
}