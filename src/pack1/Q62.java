package pack1;

import java.util.Scanner;

public class Q62{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input first matrix
        System.out.println("Enter elements for the first matrix:");
        int[][] matrix1 = readMatrix(rows, columns, scanner);

        // Input second matrix
        System.out.println("Enter elements for the second matrix:");
        int[][] matrix2 = readMatrix(rows, columns, scanner);

        // Add matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Display result
        System.out.println("Sum of the matrices:");
        printMatrix(sumMatrix);

        scanner.close();
    }

    // Function to read a matrix from the user
    private static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;

	}
}