package OOPS.Polymorphism.SuperKeyword;

/*
 * ============================================================
 * File : Main.java
 * Topic: super Keyword
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(
                        1234567890L,
                        50000,
                        6.5
                );

        System.out.println();

        account.displayDetails();

        System.out.println();

        account.showBalance();

    }

}
