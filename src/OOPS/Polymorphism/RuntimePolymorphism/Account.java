package OOPS.Polymorphism.RuntimePolymorphism;

/*
 * ============================================================
 * File : Account.java
 * Topic: Parent Class
 * ============================================================
 *
 * Runtime Polymorphism Example
 */

public class Account {

    protected double balance;

    public Account(double balance) {

        this.balance = balance;

    }

    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("Account Withdrawal Successful");
            System.out.println("Remaining Balance : ₹" + balance);

        } else {

            System.out.println("Insufficient Balance");

        }

    }

}
