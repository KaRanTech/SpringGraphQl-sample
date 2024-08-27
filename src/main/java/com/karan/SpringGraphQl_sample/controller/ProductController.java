package com.karan.SpringGraphQl_sample.controller;

import com.karan.SpringGraphQl_sample.model.Product;
import com.karan.SpringGraphQl_sample.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService service;

    @QueryMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
    @QueryMapping
    public List<Product> getByDomain(@Argument String domain){
        return service.getProductDomain(domain);
    }

    @MutationMapping
    public Product updateQuantity(@Argument Long id,@Argument int quantity){
     return service.updateQuantity(id,quantity);
    }

}
