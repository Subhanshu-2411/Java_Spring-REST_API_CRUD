package com.example.java_springrest_api_crud.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            new Student(
                    1L,
                    "Subhanshu Bansal",
                    "subhanshu.bansal5566@gmail.com",
                    LocalDate.of(2001, NOVEMBER, 24),
                    21
            );
            new Student(
                    2L,
                    "Manu Bansal",
                    "manu.bansal5566@gmail.com",
                    LocalDate.of(2000, NOVEMBER, 28),
                    22
            );

            studentRepository.saveAll(
                    List.of(subhanshu, manu)
            );
        };
    }

}
