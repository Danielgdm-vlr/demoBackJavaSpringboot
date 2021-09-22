package com.example.demoforma.controller;

import com.example.demoforma.model.dto.ProductDto;
import com.example.demoforma.service.implementation.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService){
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getAll(){
        return productService.getAll();
    }

    @PostMapping
    public ProductDto add(@RequestBody ProductDto productDto){
        return productService.add(productDto);
    }
}
