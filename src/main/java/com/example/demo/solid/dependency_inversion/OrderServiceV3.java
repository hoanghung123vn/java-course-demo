package com.example.demo.solid.dependency_inversion;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderServiceV3 {
    private Sortable sortable;

    public void createOrder(int[] array) {
        sortable.sort(array);
        // more logic
    }
}
