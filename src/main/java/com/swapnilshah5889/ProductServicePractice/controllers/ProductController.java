package com.swapnilshah5889.ProductServicePractice.controllers;

import com.swapnilshah5889.ProductServicePractice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/products")
public class ProductController {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return new Product();
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }
}
