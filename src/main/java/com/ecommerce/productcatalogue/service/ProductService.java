package com.ecommerce.productcatalogue.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ProductService {
    private WebClient webClient;

    public ProductService(WebClient webClient) {
        this.webClient = webClient;
    }

    public String getProducts() {
        return this.webClient
                .get()
                .uri("/products?limit=5")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
