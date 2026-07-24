package OOPS.Polymorphism.RuntimePolymorphism;



public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {

        super(balance);

    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount >= 1000) {

            balance -= amount;

            System.out.println("Savings Account Withdrawal Successful");
            System.out.println("Minimum Balance Maintained");
            System.out.println("Remaining Balance : ₹" + balance);

        } else {

            System.out.println("Savings Account Transaction Failed");
            System.out.println("Minimum Balance must be ₹1000.");

        }

    }

}