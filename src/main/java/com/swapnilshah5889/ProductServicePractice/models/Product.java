package com.swapnilshah5889.ProductServicePractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;

    @ManyToOne
    private Category category;

}
