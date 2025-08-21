package org.serega.OOPinJava.Lesson3;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("BMW");
        myCar.setModel("X1");
        myCar.setYear(1880);
        System.out.println(myCar);
        Car myCar2 = new Car();
        myCar2.setBrand("BMW");
        myCar2.setModel("X1");
        myCar2.setYear(2000);
        System.out.println(myCar2);
    }
}
