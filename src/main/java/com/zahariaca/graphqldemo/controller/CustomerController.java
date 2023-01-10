package com.zahariaca.graphqldemo.controller;

import com.zahariaca.graphqldemo.data.Customer;
import com.zahariaca.graphqldemo.data.CustomerInput;
import com.zahariaca.graphqldemo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;

    @QueryMapping
    public String hello() {
        return "Hello, world!";
    }

    @QueryMapping
    public Iterable<Customer> customers() {
        return customerRepository.findAll();
    }

    @QueryMapping
    public Customer customerById(@Argument Long id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public Customer customerByEmail(@Argument String email) {
        return customerRepository.findCustomerByEmail(email);
    }

    @MutationMapping
    public Customer addCustomer(@Argument(name = "input") CustomerInput customerInput) {
        return this.customerRepository.save(customerInput.getCustomerEntity());
    }
}
