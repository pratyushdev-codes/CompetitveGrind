import java.util.*;

public class maxPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // number of rows
        int n = sc.nextInt(); // number of columns
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println(maxPath(mat, 0, 0, m, n));
    }

    // Recursive function to find the maximum path sum
    public static int maxPath(int[][] mat, int i, int j, int m, int n) {
        // Base case: If out of bounds
        if (i >= m || j >= n) return Integer.MIN_VALUE;

        // If we've reached the bottom-right cell
        if (i == m - 1 && j == n - 1) return mat[i][j];

        // Move down and right
        int down = maxPath(mat, i + 1, j, m, n);
        int right = maxPath(mat, i, j + 1, m, n);

        return mat[i][j] + Math.max(down, right);
    }
}
