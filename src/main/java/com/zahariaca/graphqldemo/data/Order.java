package com.zahariaca.graphqldemo.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "ORDERS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false, updatable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "SALESPERSON_ID", nullable = false, updatable = false)
    private SalesPerson salesPerson;
    @OneToMany
    private List<OrderLine> orderLines;
}
