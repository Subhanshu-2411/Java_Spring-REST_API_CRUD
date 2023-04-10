package com.example.java_springrest_api_crud.student;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
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
