package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        var products = new ArrayList<Product>();
        var productDao = new ProductDao(products);
        var orderDao = new OrderDao(products);
        productDao.setProducts(List.of(new Product(1, "xyz")));
        System.out.println(orderDao.getProducts());
    }

}
