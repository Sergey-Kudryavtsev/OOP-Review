package org.serega.OOPReview;

import java.util.Scanner;

import static org.serega.OOPReview.Publication.getPublicationCount;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Меню:
                    1. Добавить новую публикацию.
                    2. Вывести список всех публикаций.
                    3. Поиск публикаций по автору.
                    4. Вывести общее количество публикаций.
                    0. Выход.
                    """);
            System.out.println("Выберите пункт меню: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("""
                            Какой тип публикации добавить?
                            1. Книга
                            2. Журнал
                            3. Газета
                            """);
                    System.out.println("Выберите тип: ");
                    int typeChoice = Integer.parseInt(scanner.nextLine());

                    switch (typeChoice) {
                        case 1:
                            System.out.println("Название книги: ");
                            String bookTitle = scanner.nextLine();
                            System.out.println("Автор книги: ");
                            String bookAuthor = scanner.nextLine();
                            System.out.println("Год издания книги: ");
                            int bookYear = Integer.parseInt(scanner.nextLine());
                            System.out.println("ISBN книги: ");
                            String bookIsbn = scanner.nextLine();
                            library.addPublication(new Book(bookTitle, bookAuthor, bookYear, bookIsbn));
                            break;
                        case 2:
                            System.out.println("Название журнала: ");
                            String magTitle = scanner.nextLine();
                            System.out.println("Автор журнала: ");
                            String magAuthor = scanner.nextLine();
                            System.out.println("Год издания журнала: ");
                            int magYear = Integer.parseInt(scanner.nextLine());
                            System.out.println("Номер выпуска журнала: ");
                            int magIssueNum = Integer.parseInt(scanner.nextLine());
                            library.addPublication(new Magazine(magTitle, magAuthor, magYear,magIssueNum));
                            break;
                        case 3:
                            System.out.println("Название газеты: ");
                            String newspTitle = scanner.nextLine();
                            System.out.println("Автор газеты: ");
                            String newspAuthor = scanner.nextLine();
                            System.out.println("Год издания газеты: ");
                            int newspYear = Integer.parseInt(scanner.nextLine());
                            System.out.println("День публикации газеты: ");
                            String newspPubDay = scanner.nextLine();
                            library.addPublication(new Newspaper(newspTitle, newspAuthor, newspYear, newspPubDay));
                            break;
                        default:
                            System.out.println("Неправильный выбор!");
                    }
                    break;
                case 2:
                    library.listPublication();
                    break;
                case 3:
                    System.out.println("Введите имя автора: ");
                    String searchAuthor = scanner.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;
                case 4:
                    System.out.println("Всего публикаций: " + library.countPublication());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Ошибка выбора! Попробуйте еще раз.");
            }

        }
    }
}
