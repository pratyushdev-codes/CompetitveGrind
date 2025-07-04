import java.util.*;

public class diceRoll {
    static final int MOD = 1_000_000_007;
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(countWays(n));
    }

    static int countWays(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (dp[n] != -1) return dp[n];

        int ways = 0;
        for (int dice = 1; dice <= 6; dice++) {
            ways = (ways + countWays(n - dice)) % MOD;
        }

        return dp[n] = ways;
    }
}