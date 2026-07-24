package OOPS.Polymorphism.MethodOverloading;

/*
 * ============================================================
 * Topic: Method Overloading
 * ============================================================
 *
 * Method Overloading means defining multiple methods
 * with the same name but different parameter lists.
 *
 * Compile-Time Polymorphism
 */

public  class Calculator {

    // Addition of two integers
    public int add(int num1, int num2) {

        return num1 + num2;

    }

    // Addition of three integers
    public int add(int num1, int num2, int num3) {

        return num1 + num2 + num3;

    }

    // Addition of two double values
    public double add(double num1, double num2) {

        return num1 + num2;

    }

}
