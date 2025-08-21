package org.serega.OOPinJava.Lesson5;

public class CreditAccount extends Account implements Printable {
    private double creditLimit;

    public CreditAccount(int balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    public void withdraw(double amount) {
        if (amount > 0.0 && this.balance - amount >= -this.creditLimit) {
            this.balance -= amount;
        } else {
            System.out.println("The credit limit is exceeded or the amount is incorrect.");
        }

    }

    public void printInfo() {
        System.out.println("\nCreditAccount: " + this.balance + "\nCredit Limit: " + this.creditLimit);
    }
}
