package com.springbootk8s.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootk8s.entity.Customer;
import com.springbootk8s.repository.CustomerRepository;


import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer addCustomer(Customer customer){
       return repository.save(customer);
    }

    public List<Customer> getCustomers(){
        return repository.findAll();
    }

    public Customer getOrderById(int id){
        return repository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid id : "+id));
    }
}
