import java.util.*;

public class countingOrders {
    static final long MOD = (long)1e9 + 7;

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        // Input array a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Sort array a in ascending order
        Arrays.sort(a);

        // Input array b
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Sort array b in descending order
        Arrays.sort(b);
        reverse(b);

        long result = 1;

        for (int i = 0; i < n; i++) {
            int temp = upperBound(a, b[i]);
            long count = a.length - temp;
            result = (result * Math.max(count - i, 0)) % MOD;
        }

        System.out.println(result);
    }

    // Helper to reverse array
    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Custom upper_bound implementation (first element > key)
    public static int upperBound(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
