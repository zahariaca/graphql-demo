package com.zahariaca.graphqldemo.repository;

import com.zahariaca.graphqldemo.data.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
}
