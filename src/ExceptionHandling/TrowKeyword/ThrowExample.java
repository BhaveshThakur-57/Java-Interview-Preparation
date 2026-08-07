package ExceptionHandling.TrowKeyword;

/*
 * ============================================================
 * Topic : throw Keyword
 * ============================================================
 *
 * The throw keyword is used to explicitly throw
 * an exception.
 */

public class ThrowExample {

    public static void main(String[] args) {

        int age = 15;

        if (age < 18) {

            throw new ArithmeticException("You are not eligible to vote.");

        }

        System.out.println("You can vote.");

    }

}