package com.zahariaca.graphqldemo.controller;

import com.zahariaca.graphqldemo.data.Product;
import com.zahariaca.graphqldemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProductsController {
    private final ProductRepository productRepository;

    @QueryMapping
    private Iterable<Product> products() {
        return productRepository.findAll();
    }

    @QueryMapping
    private Product productById(@Argument String id) {
        return productRepository.findById(id).orElseThrow();
    }

}
