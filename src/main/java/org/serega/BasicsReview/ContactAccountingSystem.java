package org.serega.BasicsReview;

import java.util.Scanner;

public class ContactAccountingSystem {
    private final static int MAX_CONTACT = 50;
    private final static String[] names = new String[MAX_CONTACT];
    private final static String[] numberPhone = new String[MAX_CONTACT];
    private static int countCont = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("""
                    Меню:
                    1. Добавить контакт.
                    2. Просмотреть контакты.
                    3. Найти контакты.
                    4. Удалить контакты.
                    5. Выйти.
                    """);
            System.out.println("Выберите пункт меню: ");
            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println("Ошибка: Введите число от 1 до 5!");
                continue;
            }
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1 -> addContact(scanner);
                case 2 -> watchContact(scanner);
                case 3 -> searchContact(scanner);
                case 4 -> deleteContact(scanner);
                case 5 -> exit = true;
                default -> System.out.println("Введите чисоло от 1 до 5!\n");

            }
        }
        System.out.println("Выход из программы.");
        scanner.close();
    }
    private static void addContact(Scanner scanner) {
        if (countCont >= MAX_CONTACT) {
            System.out.println("Максимальное количество контактов.");
            return;
        }
        System.out.println("Введите имя контакта: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("Введите имя! Имя не может быть пустым!!!");
            return;
        }

        System.out.println("Введите номер телефона: ");
        String numPhone = scanner.nextLine();
        String checkNumber = "^(?:\\+7|8)\\d{10}$";
        if (numPhone.isEmpty() && !numPhone.matches(checkNumber)) {
            System.out.println("Введите номер телефона! Номер не может быть пустым!!!");
            return;
        }
        if (!numPhone.matches(checkNumber)){
            System.out.println("Некорректный формат номера! Номер начинается с +7 или 8 и содержит 11 цифр!");
            return;
        }
        names[countCont] = name;
        numberPhone[countCont] = numPhone;
        countCont++;
        System.out.println("Контакт добавлен");
    }

    private static void watchContact(Scanner scanner) {
        if (countCont == 0) {
            System.out.println("Список контактов пуст.");
            return;
        }
        System.out.println("Список контактов: ");
        for (int i = 0; i < countCont; i++) {
            System.out.printf("%d. %s – %s%n", i + 1, names[i], numberPhone[i]);
        }
    }
    private static void searchContact(Scanner scanner) {
        System.out.println("Введите имя для поиска");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < countCont; i++) {
            if (names[i].equals(searchName)) {
                System.out.printf("Телефон %s: %s%n", names[i], numberPhone[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Контакт " + searchName + " не найдет");
        }
    }
    private static void deleteContact(Scanner scanner) {
        System.out.println("Введите имя для удаления");
        String deleteName = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < countCont; i++) {
            if (names[i].equals(deleteName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Контакт " + deleteName + " не найден");
            return;
        }

        for (int i = index; i < countCont - 1; i++) {
            names[i] = names[i + 1];
            numberPhone[i] = numberPhone[i + 1];
        }
        countCont--;
        names[countCont] = null;
        numberPhone[countCont] = null;
        System.out.println("Контакт успешно удален");
    }


}

