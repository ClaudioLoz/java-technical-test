package com.fractal.javatechnicaltest.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "registry_date")
    private Date registryDate;


    @OneToMany(mappedBy = "product")
    List<ProductsInOrder> productsInOrders;
}
