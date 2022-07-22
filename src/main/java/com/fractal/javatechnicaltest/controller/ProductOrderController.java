package com.fractal.javatechnicaltest.controller;

import com.fractal.javatechnicaltest.model.ProductOrder;
import com.fractal.javatechnicaltest.service.impl.ProductOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productOrder")
public class ProductOrderController {

    private final ProductOrderService productOrderService;


    public ProductOrderController(ProductOrderService productOrderService) {
        this.productOrderService = productOrderService;
    }
    //todo: handle exceptions


    @GetMapping
    public ResponseEntity<List<ProductOrder>> getAllProductOrders() {
        return productOrderService.getAllProductOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductOrder> getProductOrderById(@PathVariable Long id) {
        return productOrderService.getProductOrderById(id);
    }
    @PostMapping
    public ResponseEntity<ProductOrder> createNewProductOrder(@RequestBody ProductOrder productOrderDto) {
            return  productOrderService.createNewProductOrder(productOrderDto);
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Boolean>  deleteProductOrder(@PathVariable Long id){
//        return productOrderService.delete(id);
//    }


}
