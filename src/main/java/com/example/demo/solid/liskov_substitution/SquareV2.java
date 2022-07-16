package com.example.demo.solid.liskov_substitution;

public class SquareV2 extends Parallelogram {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    int getArea() {
        return width * width;
    }
}
