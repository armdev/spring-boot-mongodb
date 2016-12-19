package com.project.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoTemplateBean {
    
    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoTemplateBean(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    
    
}
