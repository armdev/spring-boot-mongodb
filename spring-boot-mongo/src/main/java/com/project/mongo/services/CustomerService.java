/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mongo.services;

import com.project.mongo.entity.Customer;
import com.project.mongo.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author armenar
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;
    
    public void save(Customer custumer){
        repository.save(custumer);
    }
    
    public List<Customer> findAll(){
        return repository.findAll();
    }
    
    

}
