package com.example.demoforma.model.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {

    private String name;
    private Integer stock;

    public ProductDto() { }

    public ProductDto(String name) {

        this.name = name;
    }

    public ProductDto(String name, Integer stock) {

        this.name = name;
        this.stock = stock;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getStock() {

        return stock;
    }

    public void setStock(Integer stock) {

        this.stock = stock;
    }

    @Override
    public String toString() {

        return "ProductDto{" +
                "name='" + name + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
