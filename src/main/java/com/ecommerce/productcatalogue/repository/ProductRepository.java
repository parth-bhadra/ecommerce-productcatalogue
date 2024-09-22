package com.ecommerce.productcatalogue.repository;

import com.ecommerce.productcatalogue.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getProductById(Long id);
}
