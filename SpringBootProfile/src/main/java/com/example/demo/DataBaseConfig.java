package com.example.demo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!local")
public class DataBaseConfig implements DataBaseConfigInterface {

    public DataBaseConfig() {
        System.out.println("Creating dataBase config for non-local");
    }
}