package com.example.demo.solid.dependency_inversion;

public class OrderServiceV2 {
    private Sortable sortable;
    public OrderServiceV2() {
        sortable = new BubbleSortV2();
    }

    public void createOrder(int[] array) {
        sortable.sort(array);
        // more logic
    }
}
