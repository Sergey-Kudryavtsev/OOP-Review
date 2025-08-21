package org.serega.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            menu();
            System.out.println("Введите число от 1 до 5: ");
            String choice = scanner.nextLine().trim();
            int option;
            try {
                option = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Некоректное число, попробуйте еще!");
                continue;
            }

            switch (option) {
                case 1:
                    addContact(notebook, scanner);
                    break;
                case 2:
                    deleteContact(notebook,scanner);
                    break;
                case 3:
                    searchContact(notebook, scanner);
                    break;
                case 4:
                    notebook.allContacts();
                    break;
                case  5:
                    getContacts(notebook,scanner);
                    break;
                case  0:
                    exit = true;
                    System.out.println("Выход из приложения. До свидания.");
                    break;
                default:
                    System.out.println("Не правильный выбор, попробуйте еще раз.");
            }
        }
        scanner.close();
    }

    public static void menu () {
        System.out.println("/n Меню: ");
        System.out.println("1 - Добавить контакт");
        System.out.println("2 - Удалить контакт");
        System.out.println("3 - Найти контакт по имени");
        System.out.println("4 - Посмотреть все контакты");
        System.out.println("5 - Посмотреть контакты по группе");
        System.out.println("0 - Выход");
    }

    public static void addContact (Notebook notebook, Scanner scanner) {
        System.out.println("Введите имя,фамилию: ");
        String name = scanner.nextLine().trim();
        System.out.println("Введите телефон: ");
        String phone = scanner.nextLine().trim();
        System.out.println("Введите email: ");
        String email = scanner.nextLine().trim();
        System.out.println("Введите группу (Например: Семья, Работа, Друзья ...): ");
        String group = scanner.nextLine().trim();

        Contact newContact = new Contact(name,phone,email,group);
        if (notebook.addContact(newContact)) {
            System.out.println("Контакт добавлен");
        } else {
            System.out.println("Такой контакт уже существует");
        }
    }

    public static void deleteContact (Notebook notebook, Scanner scanner) {
        System.out.println("Введите имя контакта для удаления: ");
        String name = scanner.nextLine().trim();
        System.out.println("Введите телефон контакта: ");
        String phone = scanner.nextLine().trim();
        if (notebook.deleteContact(name,phone)) {
            System.out.println("Контакт удален");
        } else {
            System.out.println("Контакт не найден");
        }
    }

    public static void searchContact(Notebook notebook, Scanner scanner) {
        System.out.println("Введите имя контакта для поиска: ");
        String name = scanner.nextLine().trim();
        List<Contact> result = notebook.searchContact(name);
        if (result.isEmpty()) {
            System.out.println("Контакт с таким именем не найден");
        } else {
            System.out.println("Найденные контакты: ");
            for (Contact contact : result) {
                System.out.println(contact);
            }
        }
    }

    public static void getContacts (Notebook notebook, Scanner scanner) {
        System.out.println("Введите название группы: ");
        String group = scanner.nextLine().trim();
        List<Contact> result = notebook.getContacts(group);
        if (result.isEmpty()) {
            System.out.println("В группе: " + group + " - контакты отсутствуют");
        } else {
            System.out.println("Контакты в группе: " + group);
            for (Contact contact : result) {
                System.out.println(contact);
            }
        }
    }
}
