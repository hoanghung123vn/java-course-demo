package com.example.demo.solid.dependency_inversion;

public class OrderService {
    private BubbleSort bubbleSort = new BubbleSort();
    public OrderService() {
    }
    public void createOrder(int[] array) {
        bubbleSort.sort(array);
        // more logic
    }
}
