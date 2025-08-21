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
                    ����:
                    1. �������� �������.
                    2. ����������� ��������.
                    3. ����� ��������.
                    4. ������� ��������.
                    5. �����.
                    """);
            System.out.println("�������� ����� ����: ");
            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println("������: ������� ����� �� 1 �� 5!");
                continue;
            }
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1 -> addContact(scanner);
                case 2 -> watchContact(scanner);
                case 3 -> searchContact(scanner);
                case 4 -> deleteContact(scanner);
                case 5 -> exit = true;
                default -> System.out.println("������� ������ �� 1 �� 5!\n");

            }
        }
        System.out.println("����� �� ���������.");
        scanner.close();
    }
    private static void addContact(Scanner scanner) {
        if (countCont >= MAX_CONTACT) {
            System.out.println("������������ ���������� ���������.");
            return;
        }
        System.out.println("������� ��� ��������: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            System.out.println("������� ���! ��� �� ����� ���� ������!!!");
            return;
        }

        System.out.println("������� ����� ��������: ");
        String numPhone = scanner.nextLine();
        String checkNumber = "^(?:\\+7|8)\\d{10}$";
        if (numPhone.isEmpty() && !numPhone.matches(checkNumber)) {
            System.out.println("������� ����� ��������! ����� �� ����� ���� ������!!!");
            return;
        }
        if (!numPhone.matches(checkNumber)){
            System.out.println("������������ ������ ������! ����� ���������� � +7 ��� 8 � �������� 11 ����!");
            return;
        }
        names[countCont] = name;
        numberPhone[countCont] = numPhone;
        countCont++;
        System.out.println("������� ��������");
    }

    private static void watchContact(Scanner scanner) {
        if (countCont == 0) {
            System.out.println("������ ��������� ����.");
            return;
        }
        System.out.println("������ ���������: ");
        for (int i = 0; i < countCont; i++) {
            System.out.printf("%d. %s � %s%n", i + 1, names[i], numberPhone[i]);
        }
    }
    private static void searchContact(Scanner scanner) {
        System.out.println("������� ��� ��� ������");
        String searchName = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < countCont; i++) {
            if (names[i].equals(searchName)) {
                System.out.printf("������� %s: %s%n", names[i], numberPhone[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("������� " + searchName + " �� ������");
        }
    }
    private static void deleteContact(Scanner scanner) {
        System.out.println("������� ��� ��� ��������");
        String deleteName = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < countCont; i++) {
            if (names[i].equals(deleteName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("������� " + deleteName + " �� ������");
            return;
        }

        for (int i = index; i < countCont - 1; i++) {
            names[i] = names[i + 1];
            numberPhone[i] = numberPhone[i + 1];
        }
        countCont--;
        names[countCont] = null;
        numberPhone[countCont] = null;
        System.out.println("������� ������� ������");
    }


}

