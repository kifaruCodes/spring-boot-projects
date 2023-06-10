package com.example.backendapi.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){

        return List.of(
                new Student(
                        1L,
                        "Kifaru",
                        "kifaru@mail.com",
                        LocalDate.of(2000, Month.MARCH, 3),
                        24
                )
        );
    }
}
