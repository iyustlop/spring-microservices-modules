package com.freelance.spring.repository;

import com.freelance.spring.domain.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {

}
