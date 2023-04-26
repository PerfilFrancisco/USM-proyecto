package com.example.prototipo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.prototipo.*"})

public class PrototipoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototipoApplication.class, args);
	}

}
