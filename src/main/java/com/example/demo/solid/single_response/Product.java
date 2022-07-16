package com.example.demo.solid.single_response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    public void saveProductToFile() {
        System.out.println("Saved to file");
    }

    public void saveProductToDB() {
        System.out.println("Saved to database");
    }
}
