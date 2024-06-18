package com.swapnilshah5889.ProductServicePractice.services;

import com.swapnilshah5889.ProductServicePractice.models.Product;
import java.util.List;

public interface ProductService {

    Product getProduct( Long id );

    List<Product> getAllProducts();

    Product updateProduct( Long id );

    Product replaceProdct( Long id, Product product );

    void deleteProduct( Long id );
}
