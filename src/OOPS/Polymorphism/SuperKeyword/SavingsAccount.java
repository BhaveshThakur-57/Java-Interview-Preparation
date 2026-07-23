package OOPS.Polymorphism.SuperKeyword;

/*
 * ============================================================
 * File : SavingsAccount.java
 * Topic: super Keyword
 * ============================================================
 *
 * Uses:
 * 1. super()       -> Calls Parent Constructor
 * 2. super.method()-> Calls Parent Method
 * 3. super.variable-> Access Parent Variable
 */

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(long accountNumber,
                          double balance,
                          double interestRate) {

        super(accountNumber, balance);

        this.interestRate = interestRate;

        System.out.println("SavingsAccount Constructor Called");

    }

    public void displayDetails() {

        super.displayAccountDetails();

        System.out.println("Interest Rate  : " + interestRate + "%");

    }

    public void showBalance() {

        System.out.println("Balance using super : ₹" + super.balance);

    }

}