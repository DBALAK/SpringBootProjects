package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
    
    @Bean
    public ApplicationRunner userInitializer(UserService userService) {
        return args -> {
            userService.create(new User("Ironman", "Robert", "Downey", 45));
            userService.create(new User("Batman", "Christian", "Bale", 36));
            userService.create(new User("Superman", "Henry", "Cavill", 28));
        };
    }
}