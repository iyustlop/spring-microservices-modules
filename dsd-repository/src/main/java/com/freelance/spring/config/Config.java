package com.freelance.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import com.mongodb.DB;
import org.springframework.stereotype.Component;

@Component
public class Config {

    private final MongoDbFactory mongo;

    @Autowired
    public Config(MongoDbFactory mongo) {
        this.mongo = mongo;
    }


//    public void example() {
//        DB db = mongo.getDb();
//        // ...
//    }

}
