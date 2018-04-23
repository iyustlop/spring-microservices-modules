package com.freelance.spring.main;

import com.freelance.spring.domain.Car;
import com.freelance.spring.repository.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EntityScan(basePackages = {"com.freelance.spring.domain"})
@EnableAutoConfiguration
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class);
    }

}
