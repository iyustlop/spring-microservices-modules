package com.freelance.spring.services.impl;

import com.freelance.spring.domain.Car;
import com.freelance.spring.exceptions.CarServiceException;
import com.freelance.spring.repository.CarRepository;
import com.freelance.spring.services.CarService;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

        Assert.assertTrue(!carList.isEmpty());
    }

    @Test
    public void lookupExistingManufacturer() throws CarServiceException {
        CarRepository mockCarRepo = mock(CarRepository.class);
        when(mockCarRepo.findByManufacturer(anyString())).thenReturn(
                new Car("mId", "mManufacturer", Arrays.asList("mModel")));
        CarService carService = new CarServiceImpl(mockCarRepo);

        Car car = carService.findByManufacturer("Ferrari");

        Assert.assertNotNull(car);
    }

    @Test
    public void throwExceptionForNonExistingManufacturer() {
        CarRepository mockCarRepo = mock(CarRepository.class);
        when(mockCarRepo.findByManufacturer(anyString())).thenReturn(null);
        CarService carService = new CarServiceImpl(mockCarRepo);

        try {
            carService.findByManufacturer("Ferrari");
            Assert.fail("Exception should had been thrown");
        } catch (Exception e) {
            Assert.assertEquals("Manufacturer Ferrari does not exist", e.getMessage());
        }
    }
}
