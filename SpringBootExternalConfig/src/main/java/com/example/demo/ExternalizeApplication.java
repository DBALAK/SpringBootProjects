package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExternalizeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalizeApplication.class, args);
    }
	
    @Bean
    public ApplicationRunner printRunner(Printer printer, @Value("${name}") String name) {
        return args -> {printer.print("name is " + name);};
    }
    
    // 1. Run mvn clean install.
    // 2. Run as Java application , it will print Balak in console.
    // 3. Keep application.properties file with same "name=Test2" in /SpringBootExternalConfig/target/ folder 
    // 4. Open cmd and go to /SpringBootExternalConfig/target/> java -jar SpringBootExternalConfig-0.0.1-SNAPSHOT.jar
    // 5. It will print Test2 in output console
}