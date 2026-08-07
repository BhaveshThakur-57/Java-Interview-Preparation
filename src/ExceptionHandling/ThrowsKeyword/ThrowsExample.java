package ExceptionHandling.ThrowsKeyword;

/*
 * ============================================================
 * Topic : throws Keyword
 * ============================================================
 *
 * The throws keyword is used in a method declaration
 * to indicate that the method may throw an exception.
 */

public class ThrowsExample {

    public static void checkAge(int age) throws Exception {

        if (age < 18) {

            throw new Exception("You are not eligible to vote.");

        }

        System.out.println("You are eligible to vote.");

    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        }

        catch (Exception exception) {

            System.out.println(exception.getMessage());

        }

        System.out.println("Program Ended");

    }

}
