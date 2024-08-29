package com.ecommerce.productcatalogue.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final WebClient webClient;

    public String getProducts() {
        return this.webClient
                .get()
                .uri("/products?limit=5")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
