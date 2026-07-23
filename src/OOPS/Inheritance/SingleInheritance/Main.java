package OOPS.Inheritance.SingleInheritance;
/*
 * ============================================================
 * Topic: Single Inheritance
 * ============================================================
*/

public class Main {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount();

        account.createAccount(
                1234567890L,
                "Bhavesh Sattavan",
                50000
        );

        account.setInterestRate(6.5);

        System.out.println("===== Savings Account =====");

        account.displayAccountDetails();

        System.out.println();

        account.calculateInterest();

    }

}
