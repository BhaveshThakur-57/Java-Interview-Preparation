package Methods;

/*
 * ============================================================
 * Topic: Return Type
 * ============================================================
 *
 * Theory:
 * --------
 * A return statement sends a value back to the calling method.
 *
 * void
 * ----
 * Returns nothing.
 *
 * int
 * ----
 * Returns integer value.
 *
 * double
 * -------
 * Returns decimal value.

 */

public class ReturnTypeExample {

    public static int add(int a, int b) {

        return a + b;

    }

    public static double calculatePercentage(int totalMarks, int obtainedMarks) {

        return (obtainedMarks * 100.0) / totalMarks;

    }

    public static void main(String[] args) {

        int sum = add(10,20);

        System.out.println("Addition = " + sum);

        double percentage = calculatePercentage(500,420);

        System.out.println("Percentage = " + percentage);

    }

}