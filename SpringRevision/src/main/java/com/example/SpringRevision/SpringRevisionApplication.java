package com.example.SpringRevision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.SpringRevision", "repository", "service"})
public class SpringRevisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRevisionApplication.class, args);
	}

}
