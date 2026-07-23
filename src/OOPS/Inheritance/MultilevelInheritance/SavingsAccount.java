package OOPS.Inheritance.MultilevelInheritance;

/*
 * ============================================================
 * Topic: Parent Class
 * ============================================================
 */

public class SavingsAccount extends Account {

    protected double interestRate;

    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    public void calculateInterest() {

        double interest = (balance * interestRate) / 100;

        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Interest Earned: ₹" + interest);

    }

}
