import java.io.BufferedReader;
import java.io.InputStreamReader;

public class newSkateboard {
    static long[] dp;
    static String s;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().trim();
        n = s.length();
        dp = new long[n+1];
        for (int i = 0; i <= n; i++) dp[i] = -1;
        long answer = solve(0);
        System.out.println(answer);
    }

    // solve(i) = total count of substrings divisible by 4 starting from index i
    static long solve(int i) {
        if (i >= n) return 0;         // base: no substrings starting beyond end
        if (dp[i] != -1) return dp[i];
        long ans = 0;

        // Option 1: take single digit at i
        int d = s.charAt(i) - '0';
        if (d % 4 == 0) ans++;

        // Option 2: take two digits (i-1,i) but we adjust pattern: treat starting at i => use (i, i+1)
        if (i + 1 < n) {
            int two = d * 10 + (s.charAt(i+1) - '0');
            if (two % 4 == 0) {
                ans += (i + 1);  // all substrings ending at i+1 that include this pair
            }
        }

        // Move on to next starting index
        ans += solve(i+1);
        return dp[i] = ans;
    }
}