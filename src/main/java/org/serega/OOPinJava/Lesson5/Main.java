package org.serega.OOPinJava.Lesson5;

public class Main {
    public static void main(String[] args) {
        Account saving = new SavingAccount(1000);
        Account credit = new CreditAccount(500, 1000.0);
        saving.deposit(200.0);
        credit.deposit(300.0);
        saving.withdraw(1500.0);
        credit.withdraw(2000.0);
        credit.withdraw(1500.0);
        Printable printable1 = (Printable)saving;
        Printable printable2 = (Printable)credit;
        printable1.printInfo();
        printable2.printInfo();
    }
}
