package ExceptionHandling.userDefinedException;

/*
 * ============================================================
 * Topic : Custom Exception
 * ============================================================
 *
 * A Custom Exception is a user-defined exception.
 * It is created by extending the Exception class.
 */

// Custom Exception Class
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {

        super(message);

    }

}

public class CustomExceptionExample {

    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {

            throw new InvalidAgeException("Age must be 18 or above.");

        }

        System.out.println("You are eligible to vote.");

    }

    public static void main(String[] args) {

        try {

            checkAge(15);

        }

        catch (InvalidAgeException exception) {

            System.out.println(exception.getMessage());

        }

        System.out.println("Program Ended");

    }

}
