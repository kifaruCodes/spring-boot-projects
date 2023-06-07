package com.example.backendapi.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping()
    public List<Student> hello(){

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
