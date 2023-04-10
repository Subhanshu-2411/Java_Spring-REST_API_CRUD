package com.example.java_springrest_api_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaSpringRestApiCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringRestApiCrudApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
