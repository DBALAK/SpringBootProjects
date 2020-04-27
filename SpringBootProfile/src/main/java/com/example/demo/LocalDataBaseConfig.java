package com.example.demo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("local")
public class LocalDataBaseConfig implements DataBaseConfigInterface {

    public LocalDataBaseConfig() {
        System.out.println("Creating DataBase Config for local");
    }

}