package com.zahariaca.graphqldemo.controller;

import com.zahariaca.graphqldemo.data.OrderLine;
import com.zahariaca.graphqldemo.repository.OrderLineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderLineController {
    private final OrderLineRepository orderLineRepository;

    @QueryMapping
    private List<OrderLine> orderLines() {
        return orderLineRepository.findAll();
    }
}
