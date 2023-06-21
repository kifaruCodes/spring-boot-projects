package com.example.backendApi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
   @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student kifaru = new Student(
                    "Kifaru",
                    "kifaru@mail.com",
                    LocalDate.of(1991, JUNE, 17)
            );

            Student edna = new Student(
                    "edna",
                    "edna@mail.com",
                    LocalDate.of(1993, JUNE, 17)
            );

            repository.saveAll(
                    List.of(kifaru, edna)
            );
        };
    }
}
