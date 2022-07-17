package com.example.demo.solid.dependency_inversion;

public class BubbleSortV2 implements Sortable {
    @Override
    public void sort(int[] array) {
        System.out.println("Array sorted by bubble sort");
    }
}
