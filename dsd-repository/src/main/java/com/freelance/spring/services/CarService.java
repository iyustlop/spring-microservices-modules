package com.freelance.spring.services;

import com.freelance.spring.domain.Car;
import com.freelance.spring.exceptions.CarServiceException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public interface CarService {

    /**
     * List of Cars.
     * @return List of Cars
     */
    List<Car> findAll();
    /**
     * Car Object.
     * @param id
     * @return manufacturer info
     */
    Car findById(String id) throws CarServiceException;

    /**
     * Save new Car.
     * @param car car object
     * @return car object
     */
    Car saveCar(Car car);

    /**
     * Update car.
     * @param car car object
     * @return car object
     */
    Car updateCar(Car car);

    /**
     * Remove Car.
     * @param car car object
     */
    void removeCar(Car car);

    /**
     * Remove car by id.
     * @param id manufacturerId
     */
    void removeCarById(String id);
}
