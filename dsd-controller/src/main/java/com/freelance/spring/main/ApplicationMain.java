package com.freelance.spring.main;

import com.freelance.spring.domain.Car;
import com.freelance.spring.repository.CarRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.freelance.spring.repository"})
@EntityScan(basePackages = {"com.freelance.spring.domain"})
public class ApplicationMain {
    public static void main(String[] args){
        SpringApplication.run(ApplicationMain.class);
    }

    @Bean
    ApplicationRunner init(CarRepository repository) {
        return args -> {
            Stream.of("Ferrari", "288","Jaguar", "E-Type","Porsche", "964" ,"Lamborghini", "Miura",
                    "Bugatti", "Veyron").forEach(name -> {
                Car car = new Car();
                car.setManufacturer(name);
                repository.save(car);
            });
            repository.findAll().forEach(System.out::println);
        };
    }
}
