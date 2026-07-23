package Arrays;

/*
 * ============================================================
 * Topic: Common Array Operations
 * ============================================================
 *
 * Operations Covered:
 * ✔ Sum
 * ✔ Average
 * ✔ Maximum
 * ✔ Minimum
 * ✔ Search
 */

public class ArrayOperations {

    public static void main(String[] args) {

        int[] numbers = {25,18,42,90,63};

        int sum = 0;

        int max = numbers[0];

        int min = numbers[0];

        for(int number : numbers){

            sum += number;

            if(number > max){

                max = number;

            }

            if(number < min){

                min = number;

            }

        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum = " + sum);

        System.out.println("Average = " + average);

        System.out.println("Maximum = " + max);

        System.out.println("Minimum = " + min);

        System.out.println();

        // Searching

        int search = 42;

        boolean found = false;

        for(int number : numbers){

            if(number == search){

                found = true;

                break;

            }

        }

        if(found){

            System.out.println(search + " Found");

        }

        else{

            System.out.println(search + " Not Found");

        }

    }

}
