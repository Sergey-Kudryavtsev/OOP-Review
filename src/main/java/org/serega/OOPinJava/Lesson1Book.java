package org.serega.OOPinJava;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Lesson1Book {
    public String title;
    public String author;
    public int pages;

    public Lesson1Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void read() {
        System.out.println("Я читаю книгу- " + this.title + ", автор- " + this.author);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Lesson1Book book = new Lesson1Book("Война и Мир", "Лев Толстой", 456);
        book.read();
    }
}
