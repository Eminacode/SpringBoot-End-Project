package com.example.SpringBootEnd.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args-> {
            Student student1 = new Student(
                    13L,
                    "Emina",
                    "emina@mail.com",
                    32
            );
            Student student2 = new Student(
                    2L,
                    "bill",
                    "bill@mail.com",
                    22
            );
            repository.getAll(List.of(student1, student2));

        };
    }
}
