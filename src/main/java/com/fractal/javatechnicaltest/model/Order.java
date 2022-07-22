package com.fractal.javatechnicaltest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code", nullable = false)
    private String code;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    @Column(name = "total_amount", nullable = false)
    private Integer totalAmount;

    @Column(name = "final_price", nullable = false)
    private Integer finalPrice;


    @OneToMany(mappedBy = "order")
    List<ProductsInOrder> productsInOrders;




}
