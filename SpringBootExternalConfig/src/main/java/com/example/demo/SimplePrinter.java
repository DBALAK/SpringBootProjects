package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class SimplePrinter implements Printer {
	
    public void print(String data) {
        System.out.println(data);
    }

}