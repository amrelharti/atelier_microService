package com.example.customer_service.web;

import com.example.customer_service.dao.entities.Customer;
import com.example.customer_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customerlist")
    public List<Customer> customerList() {
        return customerService.customerList();
    }

    @GetMapping("/{id}")
    public Optional<Customer> customerById(@PathVariable Long id) {
        return customerService.customerById(id);
    }

    @PostMapping("/savecustomer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
