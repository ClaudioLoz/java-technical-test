package com.fractal.javatechnicaltest.repository;

import com.fractal.javatechnicaltest.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder,Long>{
}
