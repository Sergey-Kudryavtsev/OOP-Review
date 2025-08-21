package org.serega.Collection.Lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Продукты: ID - " + id + " Название - " + name + " Цена - " + price;
    }

    public static void main(String[] args) {
        Map<Product, String> products = new HashMap<>();

        Product product1 = new Product(1, "Телефон", 100_000.00);
        Product product2 = new Product(2, "Компьютер", 150_000.00);
        Product product3 = new Product(3, "Планшет", 90_000.00);

        products.put(product1, "Новый телефон");
        products.put(product2, "Мощный компьютер");
        products.put(product3, "Старый планшет");

        System.out.println("Размер карты продуктов: " + products.size());
        System.out.println("Содержимое в HasMap:");
        for (Map.Entry<Product, String> entry : products.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + "--> Значение: " + entry.getValue());
        }
    }
}
