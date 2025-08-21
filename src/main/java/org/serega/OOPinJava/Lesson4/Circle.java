package org.serega.OOPinJava.Lesson4;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a Circle");
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
