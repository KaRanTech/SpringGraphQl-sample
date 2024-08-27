package com.karan.SpringGraphQl_sample.service;

import com.karan.SpringGraphQl_sample.model.Item;
import com.karan.SpringGraphQl_sample.model.Product;
import com.karan.SpringGraphQl_sample.repo.ProductRepo;
import com.karan.SpringGraphQl_sample.util.GraphQlClient;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    @Autowired
    private GraphQlClient graphQlClient;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }
    public  List<Product> getProductDomain(String domain){
        return repo.findByDomain(domain);
    }
    public Product updateQuantity(Long id,int quantity){
        Product product = repo.findById(id).orElseThrow(() -> new RuntimeException("Product is not Available"+id));
        product.setQuantity(quantity);
        return  repo.save(product);
    }

    public List<Item> getProductsList(){
        return graphQlClient.getProducts();
    }



}
