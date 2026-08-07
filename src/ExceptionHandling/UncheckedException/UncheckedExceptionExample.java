package ExceptionHandling.UncheckedException;
/*
 * ============================================================
 * Topic : Unchecked Exception
 * ============================================================
 *
 * Unchecked Exceptions occur during runtime.
 * They are not checked by the compiler.

 Examples

 ArithmeticException
 NullPointerException
 ArrayIndexOutOfBoundsException
 NumberFormatException
 ClassCastException
 IllegalArgumentException
 */

public class UncheckedExceptionExample {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int result = 20 / 0;

            System.out.println(result);

        }

        catch (ArithmeticException exception) {

            System.out.println("Cannot divide by zero.");

        }

        System.out.println("Program Ended");

    }

}

