import java.util.*;

public class twoDTravelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        
        long[] x = new long[n + 1];
        long[] y = new long[n + 1];
        
        for (int i = 1; i <= n; i++) {
            x[i] = scanner.nextLong();
            y[i] = scanner.nextLong();
        }
        
        long ans = Math.abs(x[s] - x[t]) + Math.abs(y[s] - y[t]);
        long mins = Long.MAX_VALUE;
        long mint = Long.MAX_VALUE;
        
        for (int i = 1; i <= k; i++) {
            mins = Math.min(mins, Math.abs(x[s] - x[i]) + Math.abs(y[s] - y[i]));
            mint = Math.min(mint, Math.abs(x[t] - x[i]) + Math.abs(y[t] - y[i]));
        }
        
        ans = Math.min(ans, mins + mint);
        System.out.println(ans);
    }
}


//  Logic
// Compute the direct distance between s and t.

// For each of the first k points, compute the distance from s to the point and then from the point to t. Keep track of the minimum such total distance.

// The answer is the minimum of the direct distance and the smallest indirect distance found.

// Time Complexity
// O(n) to read all points.

// O(k) to compute the minimum indirect distance.

// Overall: O(n) per test case.

// Space Complexity
// O(n) to store the coordinates.

