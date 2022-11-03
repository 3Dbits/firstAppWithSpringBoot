package com.brights.first_demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student matija = new Student(
                    "Matija",
                    "matija@mc.com",
                    LocalDate.of(2000, Month.JANUARY, 22)
            );
            Student martina = new Student(
                    "Martina",
                    "Martina@mc.com",
                    LocalDate.of(2000, Month.JANUARY, 28)
            );

            repository.saveAll(
                    List.of(matija, martina)
            );
        };
    }
}
