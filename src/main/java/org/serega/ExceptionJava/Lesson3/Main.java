package org.serega.ExceptionJava.Lesson3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger("Lesson3");

    public static void main(String[] args) {
        boolean flag = true;
        List<Lesson3> history = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            try {
                System.out.println("Введите первое число: ");
                double number1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Введите второе число: ");
                double number2 = scanner.nextDouble();
                scanner.nextLine();

                Lesson3 operation = new Lesson3(number1, number2);

                try {
                    operation.comply();
                    logger.info("Успешное деление");
                }catch (ArithmeticException e) {
                    logger.severe("Ошибка деления");
                    scanner.nextLine();
                }
                history.add(operation);
            }catch (InputMismatchException e) {
                logger.severe("Ошибка ввода");
                scanner.nextLine();
                continue;
            }
            System.out.println("Повторить операцию?");
            String reply = scanner.nextLine();

            if(!reply.equalsIgnoreCase("Да")) {
                flag = false;
            }
        }

        System.out.println("Работа завершена\n");
        scanner.nextLine();


        System.out.println("История операций: \n");
        for (Lesson3 lesson3 : history){
            System.out.println(lesson3.getDivisionResult());
        }
    }
}
