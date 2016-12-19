/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mongo;

import org.springframework.data.mongodb.MongoDbFactory;
import com.mongodb.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyMongo {
    
    private final MongoDbFactory mongo;

    @Autowired
    public MyMongo(MongoDbFactory mongo) {
        this.mongo = mongo;
    }


    public void example() {
        DB db = mongo.getDb();
     
    }
    
    
}
