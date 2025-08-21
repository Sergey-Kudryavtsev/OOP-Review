package org.serega.ExceptionJava.Lesson5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println("Введите путь к файлу");
        Scanner scanner = new Scanner(System.in);
        String pathFile = scanner.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line = reader.readLine();
            if (line != null) {
                System.out.println("Первая строка из файла: \n" + line);
                String[] count = line.split("\\s");
                System.out.println("Количество слов в строке - " + count.length);
            }else {
                System.out.println("Файл пуст");
            }

        }catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Произошла ошибка чтения файла" + e.getMessage());
        }catch (InputMismatchException e) {
            System.out.println("Введите корректное название в консоли " + e.getMessage());
        } finally {
            System.out.println("Спасибо за использование программы");
        }
    }
}
