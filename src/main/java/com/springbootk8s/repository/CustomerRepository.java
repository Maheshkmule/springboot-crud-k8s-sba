package com.springbootk8s.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootk8s.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
