package ExceptionHandling.TryWithResources;

import java.util.Scanner;

/*
 * ============================================================
 * Topic : Try-With-Resources
 * ============================================================
 *
 * Resources declared inside the try() statement
 * are automatically closed after execution.
 */

public class TryWithResourcesExample {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter Your Name : ");

            String name = scanner.nextLine();

            System.out.println("Welcome " + name);

        }

        System.out.println("Program Ended");

    }

}
