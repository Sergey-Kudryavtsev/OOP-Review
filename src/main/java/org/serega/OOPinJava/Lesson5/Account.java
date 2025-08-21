package org.serega.OOPinJava.Lesson5;

public abstract class Account {
    protected double balance;

    public Account(int balance) {
        this.balance = (double)balance;
    }

    public void deposit(double amount) {
        if (amount < 0.0) {
            this.balance += amount;
        }

    }

    public abstract void withdraw(double var1);
}
