package OOPS.Inheritance.HierarchicalInheritance;

/*
 * ============================================================
 * Topic: Child Class
 * ============================================================
 */

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public void setOverdraftLimit(double overdraftLimit) {

        this.overdraftLimit = overdraftLimit;

    }

    public void displayOverdraftLimit() {

        System.out.println("Overdraft Limit : ₹" + overdraftLimit);

    }

}
