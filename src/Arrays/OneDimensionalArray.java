package Arrays;

/*
 * ============================================================
 * Topic: One Dimensional Array
 * ============================================================
 *
 * Theory:
 * --------
 * An array is a collection of elements of the same data type.
 *
 * Advantages:
 * ✔ Stores multiple values in one variable.
 * ✔ Fast access using index.
 * ✔ Memory allocated continuously.
 *
 * Index starts from 0.
 *
 * Syntax:
 * datatype[] arrayName = new datatype[size];
 */

public class OneDimensionalArray {

    public static void main(String[] args) {

        // Array Declaration
        int[] marks = new int[5];

        // Assigning Values
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 92;
        marks[4] = 88;

        System.out.println("Accessing Individual Elements");
        System.out.println("-----------------------------");

        System.out.println("First Element : " + marks[0]);
        System.out.println("Last Element  : " + marks[4]);

        System.out.println();

        System.out.println("Traversing using for loop");
        System.out.println("-------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + " : " + marks[i]);
        }

        System.out.println();

        System.out.println("Traversing using Enhanced For Loop");
        System.out.println("----------------------------------");

        for (int mark : marks) {
            System.out.println(mark);
        }

    }
}
