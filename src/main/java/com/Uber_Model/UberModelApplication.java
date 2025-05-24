package com.Uber_Model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class UberModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberModelApplication.class, args);
	}

}
