package com.example.customer_service.service;

import com.example.customer_service.dao.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public List<Customer> customerList();
    Optional<Customer> customerById(Long id);
    public Customer saveCustomer(Customer customer);
}
