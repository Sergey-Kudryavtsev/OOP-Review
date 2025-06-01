package org.serega.OOPReview;

import java.util.Objects;

//Газета
public class Newspaper extends Publication implements Printable {
    private String publicationDay; // День публикации

    public Newspaper(String title, String author, int year, String publicationDay) {
        super(title, author, year);
        this.publicationDay = publicationDay;
    }

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }

    @Override
    public String toString() {
        return super.toString() + "\nДень публикаций: " + publicationDay;
    }

    @Override
    public void printDetails() {
        System.out.println(toString() + "День публикации: " + publicationDay);
    }

    @Override
    public String getType() {
        return "Газета";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return Objects.equals(publicationDay, newspaper.publicationDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationDay);
    }
}
