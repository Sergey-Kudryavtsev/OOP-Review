package org.serega.Collection.Lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateChecker {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // Заполнение списка числами от 0 до 100000 с дублированием одного значения
        for (int i = 0; i <= 100000; i++) {
            numbers.add(i);
        }
        numbers.add(50000); // Вставляем дубликат

        boolean hasDuplicates = false;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    hasDuplicates = true;
                    break;
                }
            }
            if (hasDuplicates) break;
        }
        System.out.println("Дубликаты найдены: " + hasDuplicates);

// Дает линейное время производительности, т.к используется хэширование.
        HashSet<Integer> numberDub = new HashSet<>(numbers);
        boolean exists = numberDub.size() != numbers.size();
        System.out.println("Дубликаты найдены в HashSet: " + exists);


        int target = numbers.size() - 1;

        //Время в ArrayList
        long startTime = System.nanoTime();
        boolean foundInList = numbers.contains(target);
        long durationList = System.nanoTime() - startTime;
        System.out.println("ArrayList содержит элемент? " + foundInList + ". Время поиска: " + durationList + " нс");

        // Время в HashSet
        startTime = System.nanoTime();
        boolean foundInSet = numberDub.contains(target);
        long durationSet = System.nanoTime() - startTime;
        System.out.println("HashSet содержит элемент? " + foundInSet + ". Время поиска: " + durationSet + " нс");
    }
}

