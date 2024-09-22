package com.ecommerce.productcatalogue.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Rating extends BaseModel {
    private Integer rating;
    private Integer count;
}
