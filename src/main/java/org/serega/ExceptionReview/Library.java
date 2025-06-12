package org.serega.ExceptionReview;

import org.serega.ExceptionReview.Book;
import org.serega.ExceptionReview.ItemNotFoundException;
import org.serega.ExceptionReview.NoAvailableCopiesException;

public class Library {
    private static final int MAX_BOOKS = 50;
    public Book[] catalog;
    private int countBook;

    public Library() {
       catalog = new Book[MAX_BOOKS];
       countBook = 0;
    }

    public void addBook(String title, String author, int copies) {
        if (countBook >= MAX_BOOKS){
            System.out.println("Каталог книг заполнен.");
            return;
        }
        Book book = new Book(title, author, copies);
        catalog[countBook++] = book;
        System.out.println("Книга успешно добавлена.");
    }

    private Book searchBookByTitle(String title) {
        for (int i = 0; i < countBook; i++) {
            if (catalog[i].getTitle().equalsIgnoreCase(title)) {
                return catalog[i];
            }
        }
        return null;
    }

    public void takeBook(String title) throws ItemNotFoundException, NoAvailableCopiesException {
        Book book = searchBookByTitle(title);
        if (book == null) {
            throw new ItemNotFoundException("Книга - " + title + " не найдена");
        }
        book.issuance();
        System.out.println("Книга выдана: " + title);
    }

    public void returnBook(String title) throws ItemNotFoundException, NoAvailableCopiesException{
        Book book = searchBookByTitle(title);
        if (book == null) {
            throw new ItemNotFoundException("Книга - " + title + " не найдена");
        }
        book.returnBook();
        System.out.println("Книга возвращена: " + title);
    }

    public void listBook() {
        if (countBook == 0) {
            System.out.println("В каталоге нет книг.");
        }else {
            System.out.println("Список пуст.");
            for (int i = 0; i < countBook; i++) {
                System.out.println(catalog[i]);
            }
        }
    }
}
