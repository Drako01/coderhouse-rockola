package com.coderhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CancionesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CancionesApplication.class, args);
    }

    // http://localhost:8082/canciones/{id}
}
