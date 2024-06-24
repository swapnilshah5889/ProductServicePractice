package com.swapnilshah5889.ProductServicePractice.repositories;

import com.swapnilshah5889.ProductServicePractice.models.Category;
import com.swapnilshah5889.ProductServicePractice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(Long id);

    Optional<Product> findByTitleAndDescription(String title, String description);

    // Uses like operator
    List<Product> findByTitleContaining(String word);

    // Uses Limit
    List<Product> findTopThreeByTitle(String title);

    List<Product> findByCategory(Category category);

    void deleteById(Long id);

    void deleteByTitle(String title);

    @Query("select p.title from Product p")
    List<String> findAllTitles();

    Product save(Product product);
}
