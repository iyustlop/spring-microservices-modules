package com.freelance.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * Config class.
 */
@Component
public class Config {

    /**
     * MongoDb Template.
     */
    private final MongoTemplate mongoTemplate;

    /**
     * Config MongoDb Template.
     * @param mongoTemplate declare template
     */
    @Autowired
    public Config(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

}
