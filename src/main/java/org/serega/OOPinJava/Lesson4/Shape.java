package org.serega.OOPinJava.Lesson4;

public abstract class Shape {
    public Shape() {
    }

    public void draw() {
        System.out.println("Drawing a generic shape");
    }

    public abstract double calculateArea();
}
