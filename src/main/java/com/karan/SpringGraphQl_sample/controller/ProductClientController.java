package com.karan.SpringGraphQl_sample.controller;

import com.karan.SpringGraphQl_sample.model.Item;
import com.karan.SpringGraphQl_sample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductClientController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Item> getProducts(){
        return service.getProductsList();
    }

}
