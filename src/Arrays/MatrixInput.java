package Arrays;

import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter Matrix Elements:");

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                matrix[row][col] = sc.nextInt();

            }
        }

        System.out.println("Matrix:");

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(matrix[row][col] + "\t");

            }

            System.out.println();
        }

        sc.close();
    }
}
