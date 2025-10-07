package com.freelance.spring.services.impl;

import com.freelance.spring.domain.Car;
import com.freelance.spring.exceptions.CarServiceException;
import com.freelance.spring.repository.CarRepository;
import com.freelance.spring.services.CarService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Repository class.
 */
@Service
@AllArgsConstructor
@NoArgsConstructor
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    /**
     * Return a list on manufacturer and model.
     * @return list on manufacturer and model
     */
    @Override
    public List<Car> findAll()  {

        return this.carRepository.findAll();
    }

    /**
     * Return a manufacturer.
     * @param byManufacturer manufacturer name
     * @return list on manufacturer and model
     */
    @Override
    public Car findById(String byManufacturer) throws CarServiceException {
        return carRepository.findById(byManufacturer)
                .orElseThrow(() -> new CarServiceException("Manufacturer " + byManufacturer + " does not exist"));
    }

    /**
     * Save a manufacturer and a model.
     * @param car car object
     * @return a car object
     */
    @Override
    public Car saveCar(Car car) {
        return this.carRepository.save(car);
    }

    /**
     * Update a manufacturer and a model.
     * @param car car object
     * @return a car object
     */
    @Override
    public Car updateCar(Car car) {
        return this.carRepository.save(car);
    }

    /**
     * Remove Manufacturer.
     * @param car car object
     */
    @Override
    public void removeCar(Car car) {
        this.carRepository.delete(car);
    }

    /**
     * Remove manufacturer by Id.
     * @param id manufacturerId
     */
    @Override
    public void removeCarById(String id) {
        this.carRepository.deleteById(id);
    }
}
