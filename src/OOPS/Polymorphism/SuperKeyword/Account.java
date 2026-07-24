package OOPS.Polymorphism.SuperKeyword;

/*
 * ============================================================
 * Topic: Parent Class
 * ============================================================
 */

public class Account {

    protected long accountNumber;
    protected double balance;

    public Account(long accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;

        System.out.println("Account Constructor Called");

    }

    public void displayAccountDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);

    }

}
