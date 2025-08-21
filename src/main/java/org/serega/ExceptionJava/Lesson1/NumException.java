package org.serega.ExceptionJava.Lesson1;

import java.util.Scanner;

public class NumException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = s.nextInt();
        if (num1 <= 0) {
            System.out.println("Первое число не может быть 0 или отрицательным");
            return;
        }
        System.out.println("Введите второе число: ");
        int num2 = s.nextInt();


        try {
            int result = num1 / num2;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка. Деление на ноль! Попробуйте другое число");
        }finally {
            System.out.println("Спасибо за использование программы");
        }
    }
}
