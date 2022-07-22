package com.fractal.javatechnicaltest.service;

import com.fractal.javatechnicaltest.model.ProductOrder;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductOrderService {

    ResponseEntity<List<ProductOrder>> getAllProductOrders();
    ResponseEntity<ProductOrder> getProductOrderById(Long id);
    ResponseEntity<ProductOrder> createNewProductOrder(ProductOrder request);
    ResponseEntity<Boolean> delete(Long id);

}
