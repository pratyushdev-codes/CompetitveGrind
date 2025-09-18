public import java.util.*;

public class MainakandArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] v = new long[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextLong();
            }

            long answer = v[n - 1] - v[0];

            // maximize (v[i] - v[0])
            for (int i = 1; i < n; i++) {
                answer = Math.max(answer, v[i] - v[0]);
            }

            // maximize (v[n-1] - v[i])
            for (int i = 0; i < n - 1; i++) {
                answer = Math.max(answer, v[n - 1] - v[i]);
            }

            // maximize (v[i] - v[i+1])
            for (int i = 0; i < n - 1; i++) {
                answer = Math.max(answer, v[i] - v[i + 1]);
            }

            System.out.println(answer);
        }

        sc.close();
    }
}

