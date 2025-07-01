import java.util.Arrays;
import java.util.Scanner;

public class QueriesAboutLessOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Sort array 'a' before using binary search
        Arrays.sort(a);

        for (int i = 0; i < m; i++) {
            int up = findUpperBound(a, b[i]);
            System.out.print(up + " ");
        }
        System.out.println();
    }

    public static int findUpperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low; // This is the count of elements ≤ target
    }
}


