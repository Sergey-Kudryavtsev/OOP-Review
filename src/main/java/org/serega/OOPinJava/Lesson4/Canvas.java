package org.serega.OOPinJava.Lesson4;

public class Canvas {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(4.0),
                new Square(5.0),
                new Triangle(6.0, 4.0)};

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area - " + shape.calculateArea());
            System.out.println();
        }
    }
}
