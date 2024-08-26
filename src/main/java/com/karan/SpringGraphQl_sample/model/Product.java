package com.karan.SpringGraphQl_sample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private Float price;
    private int quantity;
    private String domain;



    public Product(String name, String description, Float price, int quantity, String domain) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.domain = domain;
    }
}
