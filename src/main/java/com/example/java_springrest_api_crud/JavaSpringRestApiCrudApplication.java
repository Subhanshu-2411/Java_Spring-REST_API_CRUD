package com.example.java_springrest_api_crud;

import com.example.java_springrest_api_crud.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class JavaSpringRestApiCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringRestApiCrudApplication.class, args);
    }

//    @GetMapping
//    public String hello() {
//        return "Hello World";
//    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "Subhanshu Bansal",
                        "subhanshu.bansal5566@gmail.com",
                        LocalDate.of(2001, Month.NOVEMBER, 24),
                        21
                )
        );
    }

}
