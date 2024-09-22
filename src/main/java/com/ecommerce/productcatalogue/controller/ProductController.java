package com.ecommerce.productcatalogue.controller;

import com.ecommerce.productcatalogue.models.Product;
import com.ecommerce.productcatalogue.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public String getProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        System.out.println("ProductController.getProductById");
        System.out.println("id = " + id);
        return new ResponseEntity<>(this.productService.getProductById(id), HttpStatus.OK);
    }

}
