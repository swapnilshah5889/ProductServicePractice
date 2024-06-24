package com.swapnilshah5889.ProductServicePractice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Category extends BaseModel {

    @OneToMany(cascade = {CascadeType.REMOVE})
    List<Product> products;
    private String title;

}
