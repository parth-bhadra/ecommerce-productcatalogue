package com.ecommerce.productcatalogue.controller;

import com.ecommerce.productcatalogue.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public String getProducts() {
        return this.productService.getProducts();
    }

}
