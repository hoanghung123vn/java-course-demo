package com.example.demo;

import lombok.Getter;
import lombok.Setter;

public class Order {
    private final int id;

    @Getter
    @Setter
    private int customerId;

    @Getter
    @Setter
    private Product product;

    public Order(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "test";
    }
}
