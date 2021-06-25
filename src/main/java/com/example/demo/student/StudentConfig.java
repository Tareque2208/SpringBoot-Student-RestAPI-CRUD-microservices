package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2005, Month.MARCH,10)
            );

            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(1994, Month.OCTOBER,13)
            );

            studentRepository.saveAll(
                    List.of(mariam,alex,john)
            );
        };
    }
}
