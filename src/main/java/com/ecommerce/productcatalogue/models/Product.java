package com.ecommerce.productcatalogue.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private String price;
    private String imageUrl;
    @ManyToOne
    private Category category;
}
