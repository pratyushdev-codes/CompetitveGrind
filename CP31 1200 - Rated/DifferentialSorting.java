import java.util.*;

public class DifferentialSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];

            for (int i = 0; i < n; i++) { // O(N)
                v[i] = sc.nextInt();
            }

            if (v[n - 2] > v[n - 1]) {
                System.out.println("-1");
            } else if (v[n - 1] >= 0) {
                System.out.println(n - 2);
                for (int i = 1; i <= n - 2; i++) { // O(N)
                    System.out.println(i + " " + (n - 1) + " " + n);
                }
            } else {
                if (isSorted(v)) { // O(N)
                    System.out.println("0");
                } else {
                    System.out.println("-1");
                }
            }
        }
        sc.close();
    }

    // Helper function to check if array is sorted
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
