package OOPS.Polymorphism.MethodOverriding;

/*
 * ============================================================
 * File : Main.java
 * Topic: Method Overriding
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(10000);

        System.out.println("Current Balance : ₹10000");

        System.out.println();

        account.withdraw(3000);

        System.out.println();

        account.withdraw(6500);

    }

}
