package com.example.demoforma.service.implementation;

import com.example.demoforma.model.dto.ProductDto;
import com.example.demoforma.model.entity.ProductEntity;
import com.example.demoforma.repository.ProductRepository;
import com.example.demoforma.service.intrf.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){

        this.productRepository = productRepository;
    }

    @Override
    public ProductDto add(ProductDto productDto){
        productRepository.save(convertDtoToEntity(productDto));
        return convertEntityToDto(productRepository.findByName(productDto.getName()));
    }


    @Override
    public List<ProductDto> getAll(){

        List<ProductDto> productDtoList = new ArrayList<>();
        List<ProductEntity> productEntityList = productRepository.findAll();

        for (ProductEntity productEntity: productEntityList) {
            productDtoList.add(convertEntityToDto(productEntity));
        }

        return productDtoList;
    }

    @Override
    public ProductDto convertEntityToDto(ProductEntity productEntity) {

        return new ProductDto(productEntity.getName(),
                productEntity.getStock());
    }

    @Override
    public ProductEntity convertDtoToEntity(ProductDto productDto) {

        return new ProductEntity(productDto.getName(),
                productDto.getStock());
    }

}
