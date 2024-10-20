package com.example.customer_service.service;

import com.example.customer_service.dao.entities.Customer;
import com.example.customer_service.dao.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements  CustomerService{
    @Autowired
    CustomerRepository customerRepo;
    @Override
    public List<Customer> customerList() {
        return customerRepo.findAll();
    }

    @Override
    public Optional<Customer> customerById(Long id) {
        return customerRepo.findById(id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
