package com.freelance.spring.services.impl;

import com.freelance.spring.domain.Car;
import com.freelance.spring.exceptions.CarServiceException;
import com.freelance.spring.repository.CarRepository;
import com.freelance.spring.services.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class TestCarServiceImpl {

    @Test
    public void lookupAllManufacturers() {
        CarRepository mockCarRepo = mock(CarRepository.class);
        when(mockCarRepo.findAll()).thenReturn(Arrays.asList(
                new Car("mId", "mManufacturer", Arrays.asList("mModel")),
                new Car("mId", "mManufacturer", Arrays.asList("mModel"))));
        CarService carService = new CarServiceImpl(mockCarRepo);

        List<Car> carList = carService.findAll();

        Assertions.assertTrue(!carList.isEmpty());
    }

    @Test
    public void lookupExistingManufacturer() throws CarServiceException {
        CarRepository mockCarRepo = mock(CarRepository.class);
        when(mockCarRepo.findById(anyString())).thenReturn(
                java.util.Optional.of(new Car("mId", "mManufacturer", Arrays.asList("mModel"))));
        CarService carService = new CarServiceImpl(mockCarRepo);

        Car car = carService.findById("Ferrari");

        Assertions.assertNotNull(car);
    }

    @Test
    public void throwExceptionForNonExistingManufacturer() {
        CarRepository mockCarRepo = mock(CarRepository.class);
        when(mockCarRepo.findById(anyString())).thenReturn(Optional.empty());
        CarService carService = new CarServiceImpl(mockCarRepo);

        CarServiceException exception = Assertions.assertThrows(CarServiceException.class, () -> {
            carService.findById("Ferrari");
        });

        Assertions.assertEquals("Manufacturer Ferrari does not exist", exception.getMessage());
    }
}
