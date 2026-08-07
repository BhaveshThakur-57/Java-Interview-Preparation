package ExceptionHandling.CheckedException;

import java.io.FileReader;
import java.io.FileNotFoundException;

/*
 * ============================================================
 * Topic : Checked Exception
 * ============================================================
 *
 * Checked Exceptions are checked by the compiler.
 * They must be handled using try-catch or throws.
 *
 * Example

    FileNotFoundException
    IOException
    SQLException
    ClassNotFoundException
    InterruptedException

 */

public class CheckedExceptionExample {

    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("student.txt");

            System.out.println("File Opened Successfully.");

        }

        catch (FileNotFoundException exception) {

            System.out.println("File Not Found.");

        }

        System.out.println("Program Ended");

    }

}
