package com.swapnilshah5889.ProductServicePractice.controllers;

import ch.qos.logback.core.model.processor.ProcessorException;
import com.swapnilshah5889.ProductServicePractice.DTOs.ExceptionResponseDTO;
import com.swapnilshah5889.ProductServicePractice.DTOs.FakeStore.ProductResponseDTO;
import com.swapnilshah5889.ProductServicePractice.exceptions.ProductControllerExecption;
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
    public ResponseEntity<Product> createProduct(@RequestBody ProductResponseDTO product)
            throws ProductControllerExecption {
        throw new ProductControllerExecption("Something went wrong");

//        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.OK);
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

    /* This is specific exception handler which will only handle exceptions for this controller */
    @ExceptionHandler(ProductControllerExecption.class)
    public ResponseEntity<ExceptionResponseDTO> handleProductControllerException() {
        ExceptionResponseDTO responseDTO = new ExceptionResponseDTO();
        responseDTO.setMessage("Something went wrong");
        responseDTO.setDetails("Product controller specific error");
        return new ResponseEntity<>(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
