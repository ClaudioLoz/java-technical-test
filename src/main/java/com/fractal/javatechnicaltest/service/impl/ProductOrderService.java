package com.fractal.javatechnicaltest.service.impl;

import com.fractal.javatechnicaltest.model.ProductOrder;
import com.fractal.javatechnicaltest.repository.ProductOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductOrderService implements com.fractal.javatechnicaltest.service.ProductOrderService {

    private final ProductOrderRepository productOrderRepository;

    public ProductOrderService(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }
    @Override
    public ResponseEntity<List<ProductOrder>> getAllProductOrders() {
        //TODO: should use a mapper after findAll inside of stream(Model->DTO)
        return new ResponseEntity<List<ProductOrder>>(productOrderRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductOrder> getProductOrderById(Long id) {
        //TODO: should use a mapper (Model->DTO)
        ProductOrder foundProductOrder = productOrderRepository.findById(id).orElse(null);

        return new ResponseEntity<ProductOrder>(foundProductOrder, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ProductOrder> createNewProductOrder(ProductOrder productOrderDTO) {
        //TODO: should use a mapper(DTO->Model)
        ProductOrder savedProductOrder = productOrderRepository.save(productOrderDTO);
        //TODO: should use a mapper(Model->DTO)
        return new ResponseEntity<ProductOrder>(savedProductOrder, HttpStatus.CREATED);
    }

//    @Override
//    public ResponseEntity<Boolean> delete(Long id) {
////        return ResponseEntity<Boolean>(productOrderRepository.deleteById(id));;
//    }
}
