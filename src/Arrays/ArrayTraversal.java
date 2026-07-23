package Arrays;

/*
 * ============================================================
 * Topic: Array Traversal
 * ============================================================
 *
 * Theory:
 * --------
 * Traversal means visiting every element of an array exactly once.
 *
 * Types:
 * 1. Forward Traversal
 * 2. Reverse Traversal
 * 3. Enhanced For Loop
 */

public class ArrayTraversal {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Forward Traversal");
        System.out.println("-----------------");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        System.out.println("Reverse Traversal");
        System.out.println("-----------------");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        System.out.println("Enhanced For Loop");
        System.out.println("-----------------");

        for (int value : numbers) {
            System.out.println(value);
        }

    }
}
