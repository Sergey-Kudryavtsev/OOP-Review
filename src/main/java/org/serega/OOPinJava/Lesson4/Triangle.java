package org.serega.OOPinJava.Lesson4;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a Triangle");
    }

    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }
}

