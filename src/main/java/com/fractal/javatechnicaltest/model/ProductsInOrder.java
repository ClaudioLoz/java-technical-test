package com.fractal.javatechnicaltest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductsInOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_order_id",nullable = false)
    ProductOrder productOrder;

    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    Product product;

    @Column(name = "amount")
    private Integer amount;


}
