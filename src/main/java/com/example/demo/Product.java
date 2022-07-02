package com.example.demo;

public class Product {
    public int id;
    private String barcode;
    private int quantity;
    // other fields

    public Product(int id, String barcode) {
        this.id = id;
        this.barcode = barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity(int amount) {
        if (amount <= this.quantity) {
            this.quantity -= amount;
        }
    }
}
