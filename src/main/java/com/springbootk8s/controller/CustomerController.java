package com.springbootk8s.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springbootk8s.entity.Customer;
import com.springbootk8s.service.CustomerService;


import java.util.List;

@RestController
@RequestMapping
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return service.getCustomers();
    }

}