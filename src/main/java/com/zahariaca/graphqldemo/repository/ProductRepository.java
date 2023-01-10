package com.zahariaca.graphqldemo.repository;

import com.zahariaca.graphqldemo.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
