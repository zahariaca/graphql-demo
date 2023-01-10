package com.zahariaca.graphqldemo.repository;

import com.zahariaca.graphqldemo.data.SalesPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Long> {
}
