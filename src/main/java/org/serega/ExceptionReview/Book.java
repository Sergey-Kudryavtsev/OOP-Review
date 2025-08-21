package org.serega.ExceptionReview;

public class Book {
    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void issuance() throws NoAvailableCopiesException {
        if (availableCopies <= 0) {
            throw new NoAvailableCopiesException("Нет доступных экземпляров для книги: " + title);
        }
        availableCopies--;
    }

    public void returnBook() {
        availableCopies++;
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', availableCopies=%d}",
                title, author, availableCopies);
    }
}
