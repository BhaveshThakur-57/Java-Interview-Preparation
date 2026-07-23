package OOPS.Inheritance.MultilevelInheritance;

/*
 * ============================================================
 * Topic: Grand Parent Class
 * ============================================================
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

    public void displayAccount() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : ₹" + balance);

    }

}
