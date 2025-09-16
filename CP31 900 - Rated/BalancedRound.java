import java.util.*;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // sorting the array
            Arrays.sort(a);

            long counter = 1;
            long largestLength = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k) {
                    counter++; // increment
                } else {
                    counter = 1; // reset
                }
                largestLength = Math.max(largestLength, counter);
            }

            System.out.println(n - largestLength);
        }

        sc.close();
    }
}
