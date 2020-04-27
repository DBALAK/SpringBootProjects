package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		// By default only /health and /info endpoints are enabled
		SpringApplication.run(HelloWorldApplication.class, args);
		
		// To access other endpoints add the property to application.propeties
	}
}