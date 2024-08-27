package com.karan.SpringGraphQl_sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
public class Item {

    private String name;
    private String description;
    private int quantity;
}
