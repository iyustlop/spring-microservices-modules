package com.freelance.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import com.mongodb.DB;
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
