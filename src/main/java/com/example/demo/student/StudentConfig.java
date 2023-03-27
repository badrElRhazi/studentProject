package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student badr = new Student(
                    "Badr",
                    "rzi.badr@gmail .com",
                    LocalDate.of(2000, DECEMBER, 12)
            );

            Student anass = new Student(
                    "Anass",
                    "elrhazi1999@gmail .com",
                    LocalDate.of(1999, AUGUST, 6)
            );

            repository.saveAll(
                    List.of(badr,anass)
            );
        };
    }
}
