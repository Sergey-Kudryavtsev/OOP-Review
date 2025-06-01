package org.serega.OOPReview;

import java.util.Objects;

public class Magazine extends Publication implements Printable{
    private int issueNumber; // Номер выпуска

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void printDetails() {
        System.out.println(toString() + "Номер выпуска: " + issueNumber);
    }

    @Override
    public String getType() {
        return "Журнал";
    }

    @Override
    public String toString() {
        return super.toString() + "\nВыпуск № - " + issueNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return issueNumber == magazine.issueNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), issueNumber);
    }
}
