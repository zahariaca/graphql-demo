package com.zahariaca.graphqldemo.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER_LINES")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderLine {
    @Id
    @Column(name = "ORDER_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID", nullable = false, updatable = false)
    private Order order;
    @OneToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false, updatable = false)
    private Product product;
    @Column(name ="QUANTITY")
    private int quantity;
}
