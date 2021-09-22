package com.example.demoforma.config;

import com.example.demoforma.model.entity.ProductEntity;
import com.example.demoforma.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args ->{
            productRepository.save(new ProductEntity("ceara", 2));
        };
    }
}
