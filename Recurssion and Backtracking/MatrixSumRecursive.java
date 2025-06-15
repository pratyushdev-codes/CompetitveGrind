// Given two matrices A and B of size R * C. Print the summation of A and B.

// Note: Solve this problem using recursion.

// Input
// First line contains two numbers R and C (1 ≤ R, C ≤ 100). number of rows and number of columns respectively.

// Next R lines will contain C numbers ( - 100 ≤ Ai, j ≤ 100) matrix A numbers.

// Next R lines will contain C numbers ( - 100 ≤ Bi, j ≤ 100) matrix B numbers.

// Output
// Print the summation result.

// Example
import java.util.Scanner;

public class MatrixSumRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] A = new int[R][C];
        int[][] B = new int[R][C];
        int[][] result = new int[R][C];

        // Input Matrix A
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                A[i][j] = sc.nextInt();

        // Input Matrix B
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                B[i][j] = sc.nextInt();

        // Start recursive addition
        addMatrices(A, B, result, R, C, 0, 0);

        // Print the result matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recursive function to add matrices
    public static void addMatrices(int[][] A, int[][] B, int[][] result, int R, int C, int i, int j) {
        if (i >= R) return; // Base condition

        result[i][j] = A[i][j] + B[i][j];

        if (j < C - 1)
            addMatrices(A, B, result, R, C, i, j + 1); // Move to next column
        else
            addMatrices(A, B, result, R, C, i + 1, 0); // Move to next row
    }
}
