package com.freelance.spring.services;

import com.freelance.spring.domain.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public interface CarService {

    List<Car> findAll();
    Optional<Car> findById(String id);

    Car saveCar(Car car);
    Car updateCar(Car car);

    void removeCar(Car car);
    void removeCarById(String id);
}
