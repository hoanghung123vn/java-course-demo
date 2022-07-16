package com.example.demo;

import com.example.demo.solid.liskov_substitution.Rectangle;
import com.example.demo.solid.liskov_substitution.Square;
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

        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println(rect.getArea());
    }

}
