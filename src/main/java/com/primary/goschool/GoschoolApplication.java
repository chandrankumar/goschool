package com.primary.goschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.primary.goschool.*")
public class GoschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoschoolApplication.class, args);
	}

}
