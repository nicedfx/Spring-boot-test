package com.github.nicedfx.spring3;

import com.github.nicedfx.spring3.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class Spring3Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring3Application.class, args);
    }



}
