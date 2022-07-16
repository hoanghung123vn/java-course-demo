package com.example.demo.solid.liskov_substitution;

public class RectangleV2 extends Parallelogram {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
