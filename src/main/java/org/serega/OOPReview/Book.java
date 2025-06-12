package org.serega.OOPReview;

import java.util.Objects;

public class Book extends Publication implements Printable{
    private String ISBN; // Уникальный номер книжного издания

    public Book(String title, String author, int year, String ISBN) {
        super(title, author, year);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public void printDetails() {
        System.out.println(toString() + " ISBN" + ISBN);

    }

    @Override
    public String getType() {
        return "Книга";
    }

    @Override
    public String toString() {
        return super.toString() + "\nISBN= " + ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ISBN);
    }
}
