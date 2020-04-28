package com.example.demo;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigurationApplicationAppProps {

    @Autowired
    private AppProperties appProperties;

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationApplicationAppProps.class, args);
    }

    @Bean
    public ApplicationRunner printDataBaseConfigAppProps() {
        return args -> {
            System.out.println(appProperties);
            System.out.println(appProperties.getUsername());
            System.out.println(appProperties.getPassword());
            System.out.println(Arrays.toString(appProperties.getTableValues()));
            System.out.println(appProperties.getValuesMap());
            System.out.println(appProperties.getValue1());
        };
    }
}

