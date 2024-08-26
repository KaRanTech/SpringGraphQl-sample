package com.karan.SpringGraphQl_sample;

import com.karan.SpringGraphQl_sample.model.Product;
import com.karan.SpringGraphQl_sample.repo.ProductRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringGraphQlSampleApplication {

	/*@Autowired
	private ProductRepo repo;

	@PostConstruct
	public void initDB(){
		List<Product> list = Stream.of(
				new Product("phone","Apple Product",52.25F,25,"Electric"),
				new Product("Cycle","Body Excise Product",800.25F,200,"Daily"),
				new Product("Watch","Apple Watch Product",300.25F,800,"Electric"),
				new Product("Chair","Home Furnature Product",100.25F,25,"Furnature"),
				new Product("Oil","Grocery Product",520.25F,155,"Daily")
		).collect(Collectors.toList());
		repo.saveAll(list);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphQlSampleApplication.class, args);
	}

}
