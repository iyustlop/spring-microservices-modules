package com.freelance.spring.repository;

import com.freelance.spring.domain.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {

    public List<Car> findbyManufacturer(String manufacturer);
}
