package OOPS.Encapsulation;

/*
 * ============================================================
 * Topic: Encapsulation
 * ============================================================
 *
 * Theory:
 * --------
 * Encapsulation is the process of wrapping data (variables)
 * and methods into a single unit (class).
 *
 * Data is hidden using private access modifier.
 *
 * Note:
   1. Declare class variables as private.
   2. Declare class methods as public.

 * Data can only be accessed using
 * Getter and Setter methods.
 */

public class Student {

    // Private variables (Data Hiding)
    private String name;
    private int age;
    private double percentage;

    // Getter Methods

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPercentage() {
        return percentage;
    }

    // Setter Methods

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        if (age > 0) {

            this.age = age;

        } else {

            System.out.println("Invalid Age!");

        }

    }

    public void setPercentage(double percentage) {

        if (percentage >= 0 && percentage <= 100) {

            this.percentage = percentage;

        } else {

            System.out.println("Invalid Percentage!");

        }

    }

}