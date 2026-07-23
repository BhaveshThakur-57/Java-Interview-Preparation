package OOPS.Inheritance.HierarchicalInheritance;

/*
 * ============================================================
 * Topic: Parent Class
 * ============================================================
 *
 * Hierarchical Inheritance
 *
 * One parent class is inherited
 * by multiple child classes.
 */

public class Account {

    protected long accountNumber;
    protected String accountHolderName;
    protected double balance;

    public void createAccount(long accountNumber,
                              String accountHolderName,
                              double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }

    public void displayAccountDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : ₹" + balance);

    }

}
