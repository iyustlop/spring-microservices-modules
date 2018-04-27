package com.freelance.spring.config;

import com.freelance.spring.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class Config {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public Config(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

}
