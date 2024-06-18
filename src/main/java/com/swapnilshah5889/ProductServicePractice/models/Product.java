package com.swapnilshah5889.ProductServicePractice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private Category category;

}
