package Arrays;

/*
 * ============================================================
 * Topic: Taking Array Input
 * ============================================================
 *
 * Scanner is used to take input from the user.
 */

import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("\nEnter Elements");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Element " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }


        System.out.println("\nArray Elements");

        for (int value : numbers) {

            System.out.println(value);

        }

        sc.close();

    }
}
