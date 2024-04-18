package com.coderhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterpreteApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterpreteApplication.class, args);
	}

	//http://localhost:8081/interprete/{nombre}
}
