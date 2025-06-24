// Problem Statement
// You are given a string 
// S.
// How many ways are there to choose and underline eight of its characters so that those characters read c, h, o, k, u, d, a, i from left to right?
// Since the count can be enormous, print it modulo 
// (10 
// 9
//  +7).




import java.util.*;

public class chokudai {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = "chokudai";

        int[][] dp = new int[S.length()][T.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int result = count(S, T, S.length() - 1, T.length() - 1, dp);
        System.out.println(result);
    }

    public static int count(String S, String T, int i, int j, int[][] dp) {
        if (j < 0) return 1;          // Reached end of target → valid subsequence
        if (i < 0) return 0;          // Reached start of S but T is not finished → invalid

        if (dp[i][j] != -1) return dp[i][j];

        // Don't take current character
        int res = count(S, T, i - 1, j, dp) % MOD;

        // Take current character if it matches
        if (S.charAt(i) == T.charAt(j)) {
            res = (res + count(S, T, i - 1, j - 1, dp)) % MOD;
        }

        return dp[i][j] = res;
    }
}
