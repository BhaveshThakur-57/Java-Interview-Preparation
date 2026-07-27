package OOPS.Abstraction;

/*
 * ============================================================
 * Topic : Abstraction
 *
 *          BankAccount
 *               ↑
 *        SavingsAccount
 * ============================================================
 *
 * Abstraction:
 * Hides implementation details and exposes only
 * the essential functionality.
 */

// Abstract Parent Class
abstract class BankAccount {

    protected int accountNumber;
    protected String accountHolderName;

    public BankAccount(int accountNumber, String accountHolderName) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

    }

    // Abstract Method
    public abstract void accountType();

    // Normal Method
    public void displayAccountDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);

    }

}

// Child Class
class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolderName) {

        super(accountNumber, accountHolderName);

    }

    @Override
    public void accountType() {

        System.out.println("Account Type   : Savings Account");

    }

}

public class AbstractClassDemo {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(101, "Bhavesh");

        account.displayAccountDetails();

        account.accountType();

    }

}