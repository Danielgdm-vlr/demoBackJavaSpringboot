package com.example.demoforma.repository;

import com.example.demoforma.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    ProductEntity findByName(String name);
}
