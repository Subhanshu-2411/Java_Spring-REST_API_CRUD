package com.example.java_springrest_api_crud.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
