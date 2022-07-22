package com.fractal.javatechnicaltest.repository;

import com.fractal.javatechnicaltest.model.Product;
import com.fractal.javatechnicaltest.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
