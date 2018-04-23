package com.freelance.spring.services.impl;

import com.freelance.spring.domain.Car;
import com.freelance.spring.repository.CarRepository;
import com.freelance.spring.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServicesImpl implements CarServices {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return this.carRepository.findAll();
    }

    @Override
    public Optional<Car> findById(String id) {
        return this.carRepository.findById(id);
    }

    @Override
    public Car saveCar(Car car) {
        return this.carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        return this.carRepository.save(car);
    }

    @Override
    public void removeCar(Car car) {
        this.carRepository.delete(car);
    }

    @Override
    public void removeCarById(String id) {
        this.carRepository.deleteById(id);
    }
}
