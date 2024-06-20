package com.swapnilshah5889.ProductServicePractice.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass // Parents attributes copied to children. No object will ever be created of this class
abstract public class BaseModel {
    @Id
    private Long id;
    private Date createdAt;
    private Date updatedAt;

}
