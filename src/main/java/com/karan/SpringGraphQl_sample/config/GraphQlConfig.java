package com.karan.SpringGraphQl_sample.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class GraphQlConfig {

    @Bean
    public HttpGraphQlClient graphQlClient(){
        WebClient webClient = WebClient.builder().baseUrl("http://localhost:9292/graphql").build();
        return  HttpGraphQlClient.builder(webClient).build();
    }
}
