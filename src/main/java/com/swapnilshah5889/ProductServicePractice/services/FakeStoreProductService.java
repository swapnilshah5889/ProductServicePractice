package com.swapnilshah5889.ProductServicePractice.services;

import com.swapnilshah5889.ProductServicePractice.DTOs.FakeStore.ProductResponseDTO;
import com.swapnilshah5889.ProductServicePractice.models.Category;
import com.swapnilshah5889.ProductServicePractice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {

    RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProduct(Long id) {
        ProductResponseDTO responseDTO = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+id,
                ProductResponseDTO.class);

        if(responseDTO == null) {
            return null;
        }

        return convertFakeStoreProductDTOTOProduct(responseDTO);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
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

    private Product convertFakeStoreProductDTOTOProduct(ProductResponseDTO responseDTO) {
        Product product = new Product();
        product.setId(responseDTO.getId());
        product.setTitle(responseDTO.getTitle());
        product.setImage(responseDTO.getImage());
        product.setDescription(responseDTO.getDescription());
        product.setPrice(responseDTO.getPrice());
        Category category = new Category();
        category.setTitle(responseDTO.getCategory());
        product.setCategory(category);

        return product;
    }
}
