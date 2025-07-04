public import java.util.*;

public class countWays {
    static final int MOD = 1_000_000_007;
    static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        dp = new int[n + 1][x + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        System.out.println(countWays(arr, 0, x));
    }

    static int countWays(int[] arr, int idx, int target) {
        if (target == 0) return 1;           // one valid subset found
        if (idx == arr.length) return 0;     // no more elements
        if (target < 0) return 0;            // over target

        if (dp[idx][target] != -1) return dp[idx][target];

        // Option 1: include arr[idx]
        int include = countWays(arr, idx + 1, target - arr[idx]);

        // Option 2: skip arr[idx]
        int exclude = countWays(arr, idx + 1, target);

        return dp[idx][target] = (include + exclude) % MOD;
    }
} {
    
}
