package com.example.demo.solid.dependency_inversion;

import org.springframework.stereotype.Component;

@Component
public class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        System.out.println("Array sorted by selection sort");
    }
}
