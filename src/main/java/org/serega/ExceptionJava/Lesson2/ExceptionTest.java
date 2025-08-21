package org.serega.ExceptionJava.Lesson2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {

    public static String readerFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return reader.readLine();
        }finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static void getIndex() {
        int[] arr = {1,2,3};
        System.out.println(arr[10]);
    }

    public static void main(String[] args) {
        try {
            String firstLine = readerFile("text.txt");
            System.out.println("Первая строка - " + firstLine);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        try {
            getIndex();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неправильный индекс массива: " + e.getMessage());
        }

        //Общий блок обработки любых исключений
        try {
            throw new IllegalArgumentException("Искусственная ошибка аргумента");
        }catch (Exception e) {
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName() + " - Сообщение: " + e.getMessage());
        }
    }
}
