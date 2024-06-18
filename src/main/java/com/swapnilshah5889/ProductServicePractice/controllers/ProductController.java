package com.swapnilshah5889.ProductServicePractice.controllers;

import com.swapnilshah5889.ProductServicePractice.DTOs.FakeStore.ProductResponseDTO;
import com.swapnilshah5889.ProductServicePractice.models.Product;
import com.swapnilshah5889.ProductServicePractice.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    /* Get Product By ID */
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return productService.getProduct(id);
    }

    /* Fetch All Products Product */
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /* Create New Product */
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductResponseDTO product) {
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.OK);
    }

    /* Partial Update Product */
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product) {
        return product;
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
