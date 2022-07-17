package com.example.demo;

import com.example.demo.solid.dependency_inversion.*;
import com.example.demo.solid.liskov_substitution.Rectangle;
import com.example.demo.solid.liskov_substitution.Square;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // create container contain dependencies, find and put all dependencies on container
        // container: ApplicationContext
        // dependencies: beans
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        var products = new ArrayList<Product>();
        var productDao = new ProductDao(products);
        var orderDao = new OrderDao(products);
        productDao.setProducts(List.of(new Product(1, "xyz")));
        System.out.println(orderDao.getProducts());

        // open close principle
        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println(rect.getArea());

        // dependency inversion
        var sort1 = new BubbleSortV2();
        var sort2 = new SelectionSort();
        var orderService1 = new OrderServiceV3(sort1);
        var orderService2 = new OrderServiceV3(sort2);

        // spring di
        var sortable = context.getBean(Sortable.class);
        System.out.println("Instance: " + sortable);
        int[] array = {};
        sortable.sort(array);
    }

}
