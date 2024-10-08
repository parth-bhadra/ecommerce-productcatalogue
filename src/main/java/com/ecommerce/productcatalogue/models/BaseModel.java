package com.ecommerce.productcatalogue.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
class BaseModel {
    @Id
    private Long id;
    private Date createdAt;
    private Date updatedAt;
    private Date status;
}
