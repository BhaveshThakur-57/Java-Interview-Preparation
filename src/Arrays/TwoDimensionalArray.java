package Arrays;

/*
 * ============================================================
 * Topic: Two Dimensional Array
 * ============================================================
 *
 * Theory:
 * --------
 * A 2D array stores data in rows and columns.
 *
 * It is also called Matrix.
 *
 * Syntax:
 * int[][] matrix = new int[rows][columns];
 */

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] matrix = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        System.out.println("Matrix");

        for(int row=0; row<matrix.length; row++){

            for(int col=0; col<matrix[row].length; col++){

                System.out.print(matrix[row][col] + "\t");

            }

            System.out.println();

        }

    }

}
