package org.serega.Collection.Lesson3;

import java.util.*;

public class Lesson3Set {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Иван");
        names.add("Кирил");
        names.add("Дима");
        names.add("Алексей");
        names.add("Иван");
        System.out.println("Исходный список: " + names);

        Set<String> removeName = new HashSet<>(names);
        System.out.println("Список без дубликатов (HashSet): " + removeName);

        List<String> back = new ArrayList<>(removeName);
        System.out.println("Список без дубликатов (List): " + back);

        System.out.println();

        Set<String> names1 = new LinkedHashSet<>();

        names1.add("Иван");
        names1.add("Кирил");
        names1.add("Дима");
        names1.add("Алексей");
        names1.add("Иван");
        System.out.println("Исходный список: " + names1);

        Set<String> removeName1 = new LinkedHashSet<>(names1);
        System.out.println("Список без дубликатов (LinkedHashSet): " + removeName1);

        List<String> back1 = new ArrayList<>(removeName1);
        System.out.println("Список без дубликатов (List): " + back1);
     }
}
