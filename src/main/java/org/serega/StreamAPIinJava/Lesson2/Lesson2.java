package org.serega.StreamAPIinJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson2 {
    public static void main(String[] args) {
        // 1. Из коллекции
        List<String> names = Arrays.asList("Иван", "Петя", "Кирил", "Анна");
        List<String> upperCaseName = names.stream()
                .map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println("Имена в верхнем регистре: " + upperCaseName);

        //2. Из массива.
        int[] numList = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(numList)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println("_____________");

        //3. Отдельных элементов.
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8);
        integerStream.limit(5).forEach(System.out::println);

        Stream<Integer> streamCopy = Stream.of(1,2,3,4,5,6,7,8);
        List<Integer> limitedNum = streamCopy.limit(5).collect(Collectors.toList());
        System.out.println("Первые 5 цифр: " + limitedNum);

        //4.Из генератора.
        System.out.println("Случайные числа генератором: ");
        Stream<Double> number = Stream.generate(Math::random);
        number.limit(10).forEach(System.out::println);
        System.out.println("______________");

        //5.Stream.iterate
        System.out.println("Создаваемый методом iterate: ");
        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);
        evenNumbers.limit(5).forEach(System.out::println);
        System.out.println("_____________");

    }
}
