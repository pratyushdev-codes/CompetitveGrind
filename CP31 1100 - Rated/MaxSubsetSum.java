import java.util.*;

public class MaxSubsetSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 1;
        t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long[] v = new long[(int) n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            Arrays.sort(v); // n log n

            long[] pre = new long[(int) n]; // prefix sum
            pre[0] = v[0];
            for (int i = 1; i < n; i++) {
                pre[i] = v[i] + pre[i - 1];
            }

            long ans = 0;
            for (int first = 0; first <= k; first++) {
                int second = (int) (k - first);
                int left = 2 * first;
                int right = (int) n - second - 1;

                if (right < left) continue;

                long sum = pre[right] - (left == 0 ? 0 : pre[left - 1]);
                ans = Math.max(ans, sum);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
