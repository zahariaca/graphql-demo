package com.zahariaca.graphqldemo.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCTS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SIZE")
    private Integer size;
    @Column(name = "VARIETY")
    private String variety;
    @Column(name = "PRICE")
    private Float price;
    @Column(name = "STATUS")
    private String status;
}
