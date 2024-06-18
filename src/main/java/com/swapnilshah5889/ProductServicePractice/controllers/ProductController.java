package com.swapnilshah5889.ProductServicePractice.controllers;

import com.swapnilshah5889.ProductServicePractice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/products")
public class ProductController {

    /* Get Product By ID */
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return new Product();
    }

    /* Fetch All Products Product */
    @GetMapping
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    /* Create New Product */
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return new Product();
    }

    /* Partial Update Product */
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product) {
        return new Product();
    }

    /* Replace Product */
    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id,@RequestBody Product product) {
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {

    }
}
