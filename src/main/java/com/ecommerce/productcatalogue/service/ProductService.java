package com.ecommerce.productcatalogue.service;

import com.ecommerce.productcatalogue.models.Product;
import com.ecommerce.productcatalogue.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final WebClient webClient;
    private final ProductRepository productRepository;

    public String getProducts() {
        return this.webClient
                .get()
                .uri("/products?limit=5")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public Product getProductById(Long id) {
        System.out.println("ProductService.getProductById");
        System.out.println("id = " + id);

        Product product = this.productRepository.getProductById(id);

        if (product != null) {
            System.out.println("ProductService.getProductById: product found in database");
            return product;
        } else {
            Product productFromAPI = this.webClient
                    .get()
                    .uri("/products/" + id)
                    .retrieve()
                    .bodyToMono(Product.class)
                    .block();
            this.saveProduct(productFromAPI);
            return productFromAPI;

        }

    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }
}
