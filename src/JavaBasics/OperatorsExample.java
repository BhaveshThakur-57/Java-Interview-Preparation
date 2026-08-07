package JavaBasics;

/*
  Types of Operators

  1. Arithmetic
  2. Assignment
  3. Relational
  4. Logical
  5. Unary
  6. Ternary

 */

public class OperatorsExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;



        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println();

        // Logical Operators
        System.out.println("Logical Operators");
        System.out.println(a > 5 && b < 20);
        System.out.println(a < 5 || b < 20);

        System.out.println();

        // Unary Operators
        int x = 5;

        System.out.println(++x);
        System.out.println(--x);

        System.out.println();

        // Ternary Operator
        String result = (a > b) ? "A is Greater" : "B is Greater";

        System.out.println(result);

    }
}
