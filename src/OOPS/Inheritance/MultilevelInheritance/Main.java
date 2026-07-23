package OOPS.Inheritance.MultilevelInheritance;

/*
 * ============================================================
 * Topic: Multilevel Inheritance
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        PremiumSavingsAccount account =
                new PremiumSavingsAccount();

        account.createAccount(
                9876543210L,
                "Bhavesh Sattavan",
                100000
        );

        account.setInterestRate(7.5);

        account.setCashbackRate(2);

        System.out.println("===== Premium Savings Account =====");

        account.displayAccount();

        System.out.println();

        account.calculateInterest();

        System.out.println();

        account.calculateCashback(25000);

    }

}
