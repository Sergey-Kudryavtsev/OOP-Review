package org.serega.OOPinJava.Lesson7;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Колобок", "Иван Иванов");
        Book book2 = new Book("Колобок", "Иван Иванов");
        Book book3 = new Book("Мастер и Маргарита", "Булгаков");
        Book book4 = new Book("фыфыфыфы", "мипаиа");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println();
        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));
        System.out.println("book1 equals book4: " + book1.equals(book4));
        System.out.println();
        System.out.println("hashCode book1: " + book1.hashCode());
        System.out.println("hashCode book2: " + book2.hashCode());
        System.out.println("hashCode book3: " + book3.hashCode());
        System.out.println("hashCode book4: " + book4.hashCode());

    }
}
