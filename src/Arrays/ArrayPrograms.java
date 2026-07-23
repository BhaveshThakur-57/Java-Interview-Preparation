package Arrays;

/*
 * ============================================================
 * Topic: Interview Programs on Arrays
 * ============================================================
 */

public class ArrayPrograms {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 18, 25, 50, 90, 12};

        // ------------------------------------------------
        // Sum
        // ------------------------------------------------

        int sum = 0;

        for (int number : numbers) {

            sum += number;

        }

        System.out.println("Sum = " + sum);

        // ------------------------------------------------
        // Largest
        // ------------------------------------------------

        int largest = numbers[0];

        for (int number : numbers) {

            if (number > largest) {

                largest = number;

            }

        }

        System.out.println("Largest = " + largest);

        // ------------------------------------------------
        // Smallest
        // ------------------------------------------------

        int smallest = numbers[0];

        for (int number : numbers) {

            if (number < smallest) {

                smallest = number;

            }

        }

        System.out.println("Smallest = " + smallest);

        // ------------------------------------------------
        // Count Even and Odd
        // ------------------------------------------------

        int even = 0;
        int odd = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {

                even++;

            } else {

                odd++;

            }

        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);

        // ------------------------------------------------
        // Reverse Array
        // ------------------------------------------------

        System.out.println("\nReverse Array");

        for (int i = numbers.length - 1; i >= 0; i--) {

            System.out.print(numbers[i] + " ");

        }

        System.out.println();

        // ------------------------------------------------
        // Linear Search
        // ------------------------------------------------

        int target = 90;

        boolean found = false;

        for (int number : numbers) {

            if (number == target) {

                found = true;
                break;

            }

        }

        if (found) {

            System.out.println(target + " Found");

        } else {

            System.out.println(target + " Not Found");

        }

        // ------------------------------------------------
        // Second Largest
        // ------------------------------------------------

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number > first) {

                second = first;
                first = number;

            } else if (number > second && number != first) {

                second = number;

            }

        }

        System.out.println("Second Largest = " + second);

    }
}
