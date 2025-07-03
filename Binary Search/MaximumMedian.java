import java.io.*;
import java.util.*;

public class MaximumMedian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split("\\s+");
        int n = Integer.parseInt(first[0]);
        long k = Long.parseLong(first[1]);

        long[] a = Arrays.stream(br.readLine().split("\\s+"))
                         .mapToLong(Long::parseLong)
                         .toArray();
        Arrays.sort(a);

        int m = n / 2;  // median index
        long low = a[m], high = a[m] + k + 1;  // high is exclusive

        while (low < high) {
            long mid = (low + high + 1) >>> 1;
            if (canReach(a, m, mid, k)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(low);
    }

    // Check if it's possible to make all a[m..n-1] >= x using <= k ops
    private static boolean canReach(long[] a, int m, long x, long k) {
        long ops = 0;
        for (int i = m; i < a.length; i++) {
            if (a[i] < x) {
                ops += x - a[i];
                if (ops > k) return false;
            }
        }
        return ops <= k;
    }
}
