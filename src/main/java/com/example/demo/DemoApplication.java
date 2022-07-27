package com.example.demo;

import com.example.demo.annotation.CustomerDto;
import com.example.demo.annotation.CustomerEntity;
import com.example.demo.annotation.CustomerMapper;
import com.example.demo.annotation.CustomerProcessor;
import com.example.demo.aop.Service;
import com.example.demo.solid.dependency_inversion.*;
import com.example.demo.solid.liskov_substitution.Rectangle;
import com.example.demo.solid.liskov_substitution.Square;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class DemoApplication implements CommandLineRunner {
    private CustomerMapper mapper;
    private CustomerProcessor processor;

    public static void main(String[] args) {
        // create container contain dependencies, find and put all dependencies on container
        // container: ApplicationContext
        // dependencies: beans
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

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

    @Override
    public void run(String... args) throws Exception {
        var customer = new CustomerEntity();
        var response = mapper.entityToDto(customer);
        System.out.println(response);

        // annotation
        var dto = new CustomerDto();
        processor.initProcessor(dto);
        System.out.println("customer name: " + dto.getName());

    }
}
