package OOPS.Polymorphism.RuntimePolymorphism;

/*
 * ============================================================
 * Topic: Runtime Polymorphism
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        Account account;

        System.out.println("===== Savings Account =====");

        account = new SavingsAccount(10000);

        account.withdraw(3000);

        System.out.println();

        System.out.println("===== Current Account =====");

        account = new CurrentAccount(10000);

        account.withdraw(11000);

    }

}
