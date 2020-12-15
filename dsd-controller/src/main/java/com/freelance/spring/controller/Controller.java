package com.freelance.spring.controller;

import com.freelance.spring.domain.Car;
import com.freelance.spring.exceptions.CarServiceException;
import com.freelance.spring.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * Rest controller class.
 */
@RestController
//@RequestMapping(path = "/api/v1")
public class Controller {

    /**
     * Car Service injected.
     */
    @Autowired
    private CarService carService;

    /**
     * @return all manufacturer and models.
     */
    @GetMapping(path = "/car")
    public ResponseEntity<List<Car>> coolCars() {
        return ResponseEntity.ok(this.carService.findAll());
    }

    /**
     * @param id manufacturer name
     * @return manufacturer with all models
     */
    @GetMapping(path = "/car/{id}")
    public ResponseEntity<Car> coolCar(@PathVariable(name = "id") String id) throws CarServiceException {
        return ResponseEntity.ok(this.carService.findById(id));
    }

    /**
     * @param car Car pojo as json body
     * @return ok with Car Pojo in the response
     */
    @PostMapping(path = "/car")
    public ResponseEntity<Car> saveCoolCar(@RequestBody Car car) {
        return ResponseEntity.ok(this.carService.saveCar(car));
    }

    /**
     * @param id  manufacturer name
     * @param car Car pojo as json body
     * @return ok with Car Pojo in the response
     */
    @PutMapping(path = "/car/{id}")
    public ResponseEntity<Car> updateCoolCar(@PathVariable(name = "id") String id, @RequestBody Car car) {
        car.setId(id);
        return ResponseEntity.ok(this.carService.updateCar(car));
    }

    /**
     * @param id manufacturer name
     * @return ok
     */
    @DeleteMapping(path = "/car/{id}")
    public ResponseEntity<Integer> removeCoolCar(@PathVariable(name = "id") String id) {
        this.carService.removeCarById(id);
        return ResponseEntity.ok(1);
    }
}
