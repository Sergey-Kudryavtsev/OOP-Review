package org.serega.OOPinJava.Lesson4;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a Square");
    }

    public double calculateArea() {
        return this.side * this.side;
    }
}
