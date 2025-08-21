package org.serega.OOPinJava.Lesson3;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 1886) {
            System.out.println("There were no cars before");
        } else {
            this.year = year;
        }
    }

    public String toString() {
        return "Car - brand='" + this.brand + "', model='" + this.model + "', year=" + this.year;
    }
}
