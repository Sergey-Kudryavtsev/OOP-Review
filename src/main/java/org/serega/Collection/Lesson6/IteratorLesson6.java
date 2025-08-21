package org.serega.Collection.Lesson6;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLesson6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println("После удаления нечетных чисел:");
        for (Integer num : numbers) {
            System.out.println(num + "");
        }
    }
}
