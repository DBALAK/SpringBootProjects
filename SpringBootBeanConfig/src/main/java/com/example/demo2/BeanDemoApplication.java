package com.example.demo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanDemoApplication implements CommandLineRunner {

	@Autowired  private AppConfiguration appName;

	@Bean
	public AppConfiguration getAppName(@Value("${app.name}") String appName) {
		return () -> appName;
	}

	public static void main(String[] args) {
		SpringApplication.run(BeanDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application name: " + appName.getName());
	}
}
