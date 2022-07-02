package com.example.demo;

import java.util.List;

public class ProductDao {
    private List<Product> products;

    public ProductDao(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
