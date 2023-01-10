package com.zahariaca.graphqldemo.repository;

import com.zahariaca.graphqldemo.data.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerByEmail(String email);
}
