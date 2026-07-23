package OOPS.Inheritance.MultilevelInheritance;

/*
 * ============================================================
 * Topic: Child Class
 * ============================================================
 *
 * PremiumSavingsAccount inherits SavingsAccount,
 * which already inherits Account.
 *
 * Account
 *     ↑
 * SavingsAccount
 *     ↑
 * PremiumSavingsAccount
 */

public class PremiumSavingsAccount extends SavingsAccount {

    private double cashbackRate;

    public void setCashbackRate(double cashbackRate) {

        this.cashbackRate = cashbackRate;

    }

    public void calculateCashback(double purchaseAmount) {

        double cashback = (purchaseAmount * cashbackRate) / 100;

        System.out.println("Purchase Amount : ₹" + purchaseAmount);
        System.out.println("Cashback Rate   : " + cashbackRate + "%");
        System.out.println("Cashback Earned : ₹" + cashback);

    }

}
