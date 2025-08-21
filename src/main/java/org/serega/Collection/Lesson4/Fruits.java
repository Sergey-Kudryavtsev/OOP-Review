package org.serega.Collection.Lesson4;

import java.util.HashMap;
import java.util.Map;

public class Fruits {
    public static void main(String[] args) {
        HashMap<String, Integer> fruits = new HashMap<>();

        fruits.put("яблоко", 100);
        fruits.put("банан", 80);
        fruits.put("апельсин", 120);

        System.out.println("Начальное содержимое HashMap:");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
        System.out.println();

        fruits.put("банан", 90);
        System.out.println("После обновления цены на Банан:");
        for (Map.Entry<String, Integer> entry : fruits.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
        System.out.println();

        fruits.remove("апельсин");
        System.out.println("После удаления Апельсина:");
        for (Map.Entry<String,Integer> entry : fruits.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + ", Количество: " + entry.getValue());
        }
    }
}
