package com.swapnilshah5889.ProductServicePractice.repositories;

import com.swapnilshah5889.ProductServicePractice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(Long id);

    @Query("select p.title from Product p")
    List<String> findAllTitles();

}
