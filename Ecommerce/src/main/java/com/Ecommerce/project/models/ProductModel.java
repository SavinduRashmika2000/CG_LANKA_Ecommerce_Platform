package com.Ecommerce.project.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    private String title;
    private String gender;
    private String type;
    private int price;
    private String description;

    // Fixed 5 image URLs
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
}
