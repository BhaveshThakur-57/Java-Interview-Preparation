package JavaBasics;

/*

  Loops execute a block of code repeatedly.

  Types:
  1. for loop
  2. while loop
  3. do-while loop
  4. enhanced for loop

  Interview Points:
  ------------------
  for       -> Number of iterations is known.
  while     -> Number of iterations is unknown.
  do-while  -> Executes at least once.

 */

public class LoopsExample {
    public static void main(String[] args) {

        // -----------------------
        // for loop
        // -----------------------

        System.out.println("For Loop");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        // -----------------------
        // while loop
        // -----------------------

        System.out.println("While Loop");

        int num = 1;

        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        System.out.println();

        // -----------------------
        // do while
        // -----------------------

        System.out.println("Do While Loop");

        int x = 1;

        do {
            System.out.println(x);
            x++;
        } while (x <= 5);

        System.out.println();

        // -----------------------
        // Enhanced for loop
        // -----------------------

        System.out.println("Enhanced For Loop");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int value : numbers) {
            System.out.println(value);
        }
    }
}
