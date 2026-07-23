package OOPS.Inheritance.HierarchicalInheritance;

/*
 * ============================================================
 * Topic: Hierarchical Inheritance
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Savings Account =====");

        SavingsAccount savings = new SavingsAccount();

        savings.createAccount(
                1234567890L,
                "Bhavesh Sattavan",
                50000
        );

        savings.setInterestRate(6.5);

        savings.displayAccountDetails();

        savings.calculateInterest();

        System.out.println();

        System.out.println("===== Current Account =====");

        CurrentAccount current = new CurrentAccount();

        current.createAccount(
                9876543210L,
                "Rahul Sharma",
                100000
        );

        current.setOverdraftLimit(50000);

        current.displayAccountDetails();

        current.displayOverdraftLimit();

    }

}