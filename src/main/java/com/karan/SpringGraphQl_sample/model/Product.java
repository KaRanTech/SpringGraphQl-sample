package com.karan.SpringGraphQl_sample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    //@OneToMany(cascade = CascadeType.ALL)
   //private List<Subscription> subscription;



    public Product(String name, String description, Float price, int quantity, String domain) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.domain = domain;
    }
}
