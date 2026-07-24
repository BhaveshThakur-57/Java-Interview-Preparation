package OOPS.Polymorphism.MethodOverriding;

/*
 * ============================================================
 * Topic: Parent Class
 * ============================================================
 *
 * This class provides a generic implementation
 * of the withdraw() method.
 */

public class Account {

    protected double balance;

    public Account(double balance) {

        this.balance = balance;

    }

    public void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance : ₹" + balance);

        } else {

            System.out.println("Insufficient Balance");

        }

    }

}
