package org.serega.Collection.Lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Проснуться");
        list1.add("Умыться");
        list1.add("По завтракать");

        list1.add(2, "Сделать зарядку");
        System.out.println("Вставка - " + list1);

        list1.remove(0);
        System.out.println("Удаление - " + list1);

        System.out.println("Список задач: " + list1);

        System.out.println();

        List<String> list2 = new LinkedList<>();

        list2.add("Проснуться");
        list2.add("Умыться");
        list2.add("По завтракать");

        list2.add(2, "Сделать зарядку");
        System.out.println("Вставка - " + list2);

        list2.remove(1);
        System.out.println("Удаление - " + list2);

        System.out.println("Список задач: " + list2);
    }
}
