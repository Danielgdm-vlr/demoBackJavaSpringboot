package com.example.demoforma.service.intrf;

import com.example.demoforma.model.dto.ProductDto;
import com.example.demoforma.model.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    ProductDto add(ProductDto productDto);

    List<ProductDto> getAll();

    ProductDto convertEntityToDto(ProductEntity productEntity);

    ProductEntity convertDtoToEntity(ProductDto productDto);
}
