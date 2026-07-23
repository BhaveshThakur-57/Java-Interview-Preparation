package OOPS.Inheritance.HierarchicalInheritance;

/*
 * ============================================================
 * Topic: Child Class
 * ============================================================
 */

public class SavingsAccount extends Account {

    private double interestRate;

    public void setInterestRate(double interestRate) {

        this.interestRate = interestRate;

    }

    public void calculateInterest() {

        double interest = (balance * interestRate) / 100;

        System.out.println("Interest Rate   : " + interestRate + "%");
        System.out.println("Interest Amount : ₹" + interest);

    }

}
