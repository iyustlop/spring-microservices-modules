package com.freelance.spring.controller;

import com.freelance.spring.domain.Car;
import com.freelance.spring.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path = "/api/v1")
public class Controller {

    @Autowired
    private CarService carService;

    @GetMapping(path = "/car")
    public ResponseEntity<List<Car>> coolCars() {
        return ResponseEntity.ok(this.carService.findAll());
    }

    @GetMapping(path = "/car/{id}")
    public ResponseEntity<Optional<Car>> coolCar(@PathVariable(name= " id") String id) {
        return ResponseEntity.ok(this.carService.findById(id));
    }

    @PostMapping(path = "/car")
    public ResponseEntity<Car> saveCoolCar(@RequestBody Car car){
        return ResponseEntity.ok(this.carService.saveCar(car));
    }

    @PutMapping(path = "/car/{id}")
    public ResponseEntity<Car> updateCoolCar(@PathVariable(name = "id") String id ,@RequestBody Car car){
        car.setId(id);
        return ResponseEntity.ok(this.carService.updateCar(car));
    }

    @DeleteMapping(path = "/car/{id}")
    public ResponseEntity<Integer> removeCoolCar(@PathVariable(name = "id") String id){
        this.carService.removeCarById(id);
        return ResponseEntity.ok(1);
    }
}
