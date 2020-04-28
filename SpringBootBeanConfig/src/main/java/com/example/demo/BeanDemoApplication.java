package com.example.demo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanDemoApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(BeanDemoApplication.class, args);
    }
	
    @Bean
    public ApplicationRunner printRunner(Printer printer) {
        return args -> {printer.print("Hello from BeanDemoApplication");};
    }

}