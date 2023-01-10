package com.zahariaca.graphqldemo.controller;

import com.zahariaca.graphqldemo.data.Order;
import com.zahariaca.graphqldemo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrdersController {
    private final OrderRepository orderRepository;

    @QueryMapping
    private Iterable<Order> orders() {
        return orderRepository.findAll();
    }

    @QueryMapping
    private Order orderById(@Argument String id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    private List<Order> orderByCustomerId(@Argument Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }
}
