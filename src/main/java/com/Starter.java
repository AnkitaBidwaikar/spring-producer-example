package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com"})

public class Starter {
	
	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(Starter.class, args);
		
	}

}
