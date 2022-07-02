package com.example.demo;

import java.util.List;

public class OrderDao {
    private List<Product> products;

    public OrderDao(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void createOrder(String customerType) {
        if("vip".equals(customerType)) {
            // do something
        } else  {
            // do something else
        }
    }

    public Order createOrder(Customer customer, Product product) {
        var order = new Order(1);
        order.setProduct(product);
        order.setCustomerId(customer.getId());
        return order;
    }

    public Order createOrder(int customerId, Product product) {
        var order = new Order(1);
        order.setProduct(product);
        order.setCustomerId(customerId);
        return order;
    }

}
