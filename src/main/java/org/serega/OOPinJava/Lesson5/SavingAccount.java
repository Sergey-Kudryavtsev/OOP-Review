package org.serega.OOPinJava.Lesson5;

public class SavingAccount extends Account implements Printable {
    public SavingAccount(int balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds or incorrect withdrawal amount.");
        }

    }

    public void printInfo() {
        System.out.println("\nSavingAccount: " + this.balance);
    }
}
