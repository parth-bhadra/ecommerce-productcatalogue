package com.ecommerce.productcatalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.ecommerce.productcatalogue", "testpackage"})
@SpringBootApplication
public class ProductCatalogueApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogueApplication.class, args);
    }
}
