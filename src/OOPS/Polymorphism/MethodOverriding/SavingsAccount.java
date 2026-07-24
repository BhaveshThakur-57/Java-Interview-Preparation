package OOPS.Polymorphism.MethodOverriding;

/*
 * ============================================================
 * Topic: Method Overriding
 * ============================================================
 *
 * SavingsAccount overrides the withdraw()
 * method of Account class.
 */

public class SavingsAccount extends Account {

    private static final double MINIMUM_BALANCE = 1000;

    public SavingsAccount(double balance) {

        super(balance);

    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount >= MINIMUM_BALANCE) {

            balance -= amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Minimum Balance Maintained");
            System.out.println("Remaining Balance : ₹" + balance);

        } else {

            System.out.println("Transaction Failed");
            System.out.println("Minimum Balance of ₹1000 must be maintained.");

        }

    }

}
