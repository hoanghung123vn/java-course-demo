package com.example.demo.solid.open_close;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AreaCalculator {
    private Shape shape;

    public void getArea() {
      if (shape instanceof Square) {
          System.out.println("Square area");
      } else if (shape instanceof Circle) {
          System.out.println("Circle area");
      }
    }

}
