package com.swapnilshah5889.ProductServicePractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Category extends BaseModel {
    private String title;
}
