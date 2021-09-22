package com.example.demoforma.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "stock")
    private Integer stock;

    public ProductEntity() { }

    public ProductEntity(String name) {

        this.name = name;
    }

    public ProductEntity(String name, Integer stock) {

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

        return "ProductEntity{" +
                "name='" + name + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }
}
