import java.util.*;

public class Inflation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] p = new long[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextLong();
            }

            long sum = p[0];  // current sum of prices till i-1
            long added = 0;   // total extra amount added

            for (int i = 1; i < n; i++) {
                long maxAllowed = (sum * k);
                if (p[i] * 100 > maxAllowed) {
                    // We need to increase sum
                    long required = ((p[i] * 100 + k - 1) / k); // ceil division
                    long needToAdd = required - sum;
                    added += needToAdd;
                    sum += needToAdd;
                }
                sum += p[i];
            }

            System.out.println(added);
        }
    }
}
