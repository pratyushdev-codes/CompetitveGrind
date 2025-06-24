import java.util.*;

public class cutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Total ribbon length
        int a = sc.nextInt(); // Cut size a
        int b = sc.nextInt(); // Cut size b
        int c = sc.nextInt(); // Cut size c

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int result = findCuts(n, a, b, c, dp);
        System.out.println(result);
    }

    public static int findCuts(int i, int a, int b, int c, int[] dp) {
        if (i == 0) return 0;
        if (i < 0) return Integer.MIN_VALUE;
        if (dp[i] != -1) return dp[i];

        int cutA = findCuts(i - a, a, b, c, dp);
        int cutB = findCuts(i - b, a, b, c, dp);
        int cutC = findCuts(i - c, a, b, c, dp);

        int maxCuts = Math.max(cutA, Math.max(cutB, cutC));

        // If no valid cut is possible, return -INF
        if (maxCuts == Integer.MIN_VALUE) {
            dp[i] = Integer.MIN_VALUE;
        } else {
            dp[i] = 1 + maxCuts;
        }

        return dp[i];
    }
}
