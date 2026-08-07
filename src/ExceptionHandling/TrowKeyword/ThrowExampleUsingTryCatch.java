package ExceptionHandling.TrowKeyword;

/*
 * throw with try-catch
 */

public class ThrowExampleUsingTryCatch {

    public static void main(String[] args) {

        int age = 15;

        try {

            if (age < 18) {

                throw new ArithmeticException("You are not eligible to vote.");

            }

            System.out.println("You can vote.");

        }

        catch (ArithmeticException exception) {

            System.out.println(exception.getMessage());

        }

        System.out.println("Program Ended");

    }

}
