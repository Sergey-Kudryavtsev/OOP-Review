package org.serega.ExceptionReview;

import org.serega.ExceptionReview.Book;
import org.serega.ExceptionReview.ItemNotFoundException;
import org.serega.ExceptionReview.NoAvailableCopiesException;

import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {
        Library library = new Library();

        try (Scanner scanner = new Scanner(System.in)){
            boolean exit = false;

            while (!exit) {
                System.out.println("""
                        Меню:
                        1. Вывести каталог.
                        2. Добавить объект.
                        3. Выдать объект.
                        4. Вернуть объект.
                        5. Выйти из приложения.
                        """);
                System.out.println("Выберите пункт меню: ");
                String input = scanner.nextLine();

                int choice;

                try {
                    choice = Integer.parseInt(input);
                }catch (NumberFormatException e) {
                    System.out.println("Ошибка. Введите число от 1 до 5.");
                    continue;
                }

                switch (choice) {
                    case 1 -> library.listBook();
                    case 2 -> {
                        System.out.println("Введите название книги: ");
                        String title = scanner.nextLine();
                        System.out.println("Введите автора: ");
                        String author = scanner.nextLine();
                        System.out.println("Введите количество экземпляров: ");
                        int copies;
                        try {
                            copies = Integer.parseInt(scanner.nextLine());
                        }catch (NumberFormatException e) {
                            System.out.println("Введите количество числом.");
                            break;
                        }
                        library.addBook(title, author,copies);
                    }
                    case 3 -> {
                        System.out.println("Для выдачи введите название книги: ");
                        String takeTitle = scanner.nextLine();
                        try {
                            library.takeBook(takeTitle);
                        }catch (ItemNotFoundException | NoAvailableCopiesException e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }
                    }
                    case 4 -> {
                        System.out.println("Для возврата введите название книги: ");
                        String returnTitle = scanner.nextLine();
                        try {
                            library.returnBook(returnTitle);
                        }catch (ItemNotFoundException | NoAvailableCopiesException e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }
                    }
                    case 5 -> {
                        exit = true;
                        System.out.println("Выход из приложения. До свидания!");
                    }
                    default -> System.out.println("Не верный пункт меню, попробуйте заново.");
                }
            }
        }
    }
}
