package com.swapnilshah5889.ProductServicePractice.services;

import com.swapnilshah5889.ProductServicePractice.DTOs.FakeStore.ProductResponseDTO;
import com.swapnilshah5889.ProductServicePractice.models.Product;
import com.swapnilshah5889.ProductServicePractice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
public class SelfProductService implements ProductService{

    ProductRepository productRepository;

    SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        // throw an error
        if(optionalProduct.isEmpty()) {
            return null;
        }

        return optionalProduct.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(ProductResponseDTO product) {
        return null;
    }

    @Override
    public Product updateProduct(Long id) {
        return null;
    }

    @Override
    public Product replaceProdct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

}
