package com.karan.SpringGraphQl_sample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long subId;
    private String subscriptionType;
    private String status;

   // @ManyToOne
    //@JoinColumn(name="id")
   // public Product product;

}
