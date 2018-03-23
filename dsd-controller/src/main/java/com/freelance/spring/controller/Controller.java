package com.freelance.spring.controller;

import com.freelance.spring.domain.Car;
import com.freelance.spring.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private CarRepository repository;

    public Controller(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/car")
    public List<Car> coolCars() {
        return repository.findAll();
    }
}
