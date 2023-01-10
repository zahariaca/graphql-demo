package com.zahariaca.graphqldemo.controller;

import com.zahariaca.graphqldemo.data.SalesPerson;
import com.zahariaca.graphqldemo.repository.SalesPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class SalesPeopleController {
    private final SalesPersonRepository salesPersonRepository;

    @QueryMapping
    public Iterable<SalesPerson> salesPeople() {
        return salesPersonRepository.findAll();
    }

    @QueryMapping
    public SalesPerson salesPersonById(@Argument  Long id) {
        return salesPersonRepository.findById(id).orElseThrow();
    }
}
