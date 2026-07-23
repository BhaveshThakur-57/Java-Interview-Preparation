package OOPS.Polymorphism.RuntimePolymorphism;

/*
 * ============================================================
 * File : CurrentAccount.java
 * ============================================================
 */

public class CurrentAccount extends Account {

    public CurrentAccount(double balance) {

        super(balance);

    }

    @Override
    public void withdraw(double amount) {

        balance -= amount;

        System.out.println("Current Account Withdrawal Successful");
        System.out.println("Remaining Balance : ₹" + balance);

    }

}
