import java.util.*;

public class LeftMaxRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();              // Number of elements
        int[] A = new int[N];              // Input array
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] result = new int[N];         // Result array to store left max for each index
        computeLeftMax(A, result, 0, Integer.MIN_VALUE);  // Start recursion

        // Print the result
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }

    // Recursive function to compute left max up to index i
    public static void computeLeftMax(int[] A, int[] result, int index, int currentMax) {
        if (index == A.length) return;

        currentMax = Math.max(currentMax, A[index]);
        result[index] = currentMax;

        computeLeftMax(A, result, index + 1, currentMax);
    }
}
