import java.util.*;

public class numberOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            long count = 0;

            for (int i = 0; i < n; i++) {
                int low = lowerBound(arr, i + 1, n - 1, l - arr[i]);
                int high = upperBound(arr, i + 1, n - 1, r - arr[i]);
                count += (high - low + 1);
            }

            System.out.println(count);
        }
    }

    // Lower bound: first index >= val
    public static int lowerBound(int[] arr, int low, int high, int val) {
        int res = high + 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= val) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    // Upper bound: last index <= val
    public static int upperBound(int[] arr, int low, int high, int val) {
        int res = low - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= val) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
