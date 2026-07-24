package OOPS.Polymorphism.MethodOverloading;

/*
 * ============================================================
 * Topic: Method Overloading
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Addition of Two Integers");

        System.out.println(
                calculator.add(10, 20)
        );

        System.out.println();

        System.out.println("Addition of Three Integers");

        System.out.println(
                calculator.add(10, 20, 30)
        );

        System.out.println();

        System.out.println("Addition of Two Double Values");

        System.out.println(
                calculator.add(15.5, 20.5)
        );

    }

}