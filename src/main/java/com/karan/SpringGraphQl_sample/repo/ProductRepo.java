package com.karan.SpringGraphQl_sample.repo;

import com.karan.SpringGraphQl_sample.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    List<Product> findByDomain(String domain);
}
