package com.swapnilshah5889.ProductServicePractice.DTOs.FakeStore;

import lombok.Data;

@Data
public class ProductResponseDTO {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
