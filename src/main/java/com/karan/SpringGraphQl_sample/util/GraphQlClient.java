package com.karan.SpringGraphQl_sample.util;

import com.karan.SpringGraphQl_sample.config.GraphQlConfig;
import com.karan.SpringGraphQl_sample.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GraphQlClient {

    @Autowired
    private HttpGraphQlClient graphQlConfig;

    public List<Item> getProducts(){
        String queryProduct = "query GetAllProducts {\n" +
                "    getAllProducts {\n" +
                "        name\n" +
                "        description\n" +
                "        quantity\n" +
                "    }\n" +
                "}";
        return graphQlConfig.document(queryProduct).retrieve("getAllProducts").toEntityList(Item.class).block();
    }
}
