package com.example.customer_service;

import com.example.customer_service.dao.entities.Customer;
import com.example.customer_service.dao.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.customer_service.dao.repositories")
@EntityScan(basePackages = "com.example.customer_service.dao.entities")
public class CustomerDataServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerDataServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("X").email("X@gmail.com").build());
            customerRepository.save(Customer.builder().name("Y").email("Y@gmail.com").build());
        };
    }
}
