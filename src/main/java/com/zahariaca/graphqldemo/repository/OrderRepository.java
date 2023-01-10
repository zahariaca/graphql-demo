package com.zahariaca.graphqldemo.repository;

import com.zahariaca.graphqldemo.data.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findByCustomerId(Long customerId);
}
