import java.util.*;
import java.io.*;

public class DolceVita {

    static boolean pf(long val, int ind, int x, int mid) {
        return val + (1L * (ind + 1) * (mid - 1)) <= x;
        // if the cost of the ith packet is less than or equal to x for that day -> I can buy it
    }

    static int binSearch(long val, int ind, int x) {
        int low = 1, high = (int)1e9 + 5;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (pf(val, ind, x, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } // O(32)

        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] cost = new int[n];  // a
            for (int i = 0; i < n; i++) { // O(N)
                cost[i] = sc.nextInt();
            }

            Arrays.sort(cost); // b -> O(N log N)

            long[] presum = new long[n];
            presum[0] = cost[0];
            for (int i = 1; i < n; i++) {
                presum[i] = presum[i - 1] + cost[i];
            } // O(N)

            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += binSearch(presum[i], i, x); // O(32)
            } // O(N * 32)

            System.out.println(ans);
        }

        sc.close();
    }
}

// Total time complexity : O(N * 32 + N log N)
// Total space complexity : O(N)
