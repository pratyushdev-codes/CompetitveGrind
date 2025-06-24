// /*Vasya has n days of vacations! So he decided to improve his IT skills and do sport. Vasya knows the following information about each of this n days: whether that gym opened and whether a contest was carried out in the Internet on that day. For the i-th day there are four options:

// on this day the gym is closed and the contest is not carried out;
// on this day the gym is closed and the contest is carried out;
// on this day the gym is open and the contest is not carried out;
// on this day the gym is open and the contest is carried out.
// On each of days Vasya can either have a rest or write the contest (if it is carried out on this day), or do sport (if the gym is open on this day).

// Find the minimum number of days on which Vasya will have a rest (it means, he will not do sport and write the contest at the same time). The only limitation that Vasya has — he does not want to do the same activity on two consecutive days: it means, he will not do sport on two consecutive days, and write the contest on two consecutive days.

// Input
// The first line contains a positive integer n (1 ≤ n ≤ 100) — the number of days of Vasya's vacations.

// The second line contains the sequence of integers a1, a2, ..., an (0 ≤ ai ≤ 3) separated by space, where:

// ai equals 0, if on the i-th day of vacations the gym is closed and the contest is not carried out;
// ai equals 1, if on the i-th day of vacations the gym is closed, but the contest is carried out;
// ai equals 2, if on the i-th day of vacations the gym is open and the contest is not carried out;
// ai equals 3, if on the i-th day of vacations the gym is open and the contest is carried out.
// Output
// Print the minimum possible number of days on which Vasya will have a rest. Remember that Vasya refuses:

// to do sport on any two consecutive days,
// to write the contest on any two consecutive days.
// Examples
// inputCopy
// 4
// 1 3 2 0
// outputCopy
// 2
// inputCopy
// 7
// 1 3 3 2 1 2 3
// outputCopy
// 0
// inputCopy
// 2
// 2 2
// outputCopy
// 1
// Note
// In the first test Vasya can write the contest on the day number 1 and do sport on the day number 3. Thus, he will have a rest for only 2 days.

// In the second test Vasya should write contests on days number 1, 3, 5 and 7, in other days do sport. Thus, he will not have a rest for a single day.

// In the third test Vasya can do sport either on a day number 1 or number 2. He can not do sport in two days, because it will be contrary to the his limitation. Thus, he will have a rest for only one day.

// Link:- https://codeforces.com/problemset/problem/698/A

import java.util.*;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int dp[][] = new int[n + 1][3]; // prev: 0=rest, 1=contest, 2=sport
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(count(0, 0, arr, dp));
    }

    // idx = current day, prev = what he did on the previous day (0=rest, 1=contest, 2=sport)
    public static int count(int idx, int prev, int[] arr, int[][] dp) {
        if (idx == arr.length) return 0; // base case

        if (dp[idx][prev] != -1) return dp[idx][prev];

        int best = Integer.MAX_VALUE;

        // Option 1: Rest
        best = Math.min(best, 1 + count(idx + 1, 0, arr, dp));

        // Option 2: Contest
        if ((arr[idx] == 1 || arr[idx] == 3) && prev != 1) {
            best = Math.min(best, count(idx + 1, 1, arr, dp));
        }

        // Option 3: Sport
        if ((arr[idx] == 2 || arr[idx] == 3) && prev != 2) {
            best = Math.min(best, count(idx + 1, 2, arr, dp));
        }

        dp[idx][prev] = best;
        return best;
    }
}
