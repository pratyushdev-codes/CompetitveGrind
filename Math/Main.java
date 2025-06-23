// B. Different Divisors
// time limit per test1 second
// memory limit per test256 megabytes
// Positive integer 𝑥
//  is called divisor of positive integer 𝑦
// , if 𝑦
//  is divisible by 𝑥
//  without remainder. For example, 1
//  is a divisor of 7
//  and 3
//  is not divisor of 8
// .

// We gave you an integer 𝑑
//  and asked you to find the smallest positive integer 𝑎
// , such that

// 𝑎
//  has at least 4
//  divisors;
// difference between any two divisors of 𝑎
//  is at least 𝑑
// .
// Input
// The first line contains a single integer 𝑡
//  (1≤𝑡≤3000
// ) — the number of test cases.

// The first line of each test case contains a single integer 𝑑
//  (1≤𝑑≤10000
// ).

// Output
// For each test case print one integer 𝑎
//  — the answer for this test case.

// Example

import java.util.*;

public class Main {
    // Compute product of digits of x
    static long prod(long x) {
        long r = 1;
        while (x > 0) {
            r *= (x % 10);
            x /= 10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();

        long ans = prod(n);
        String s = Long.toString(n);
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '0') continue;  // can't reduce 0

            // Build candidate: reduce digit i by 1, set following to '9'
            StringBuilder t = new StringBuilder(s);
            t.setCharAt(i, (char)(s.charAt(i) - 1));
            for (int j = i + 1; j < len; j++) t.setCharAt(j, '9');

            // Strip leading zeros
            String ts = t.toString().replaceFirst("^0+", "");
            if (ts.isEmpty()) ts = "0";
            long cand = Long.parseLong(ts);
            ans = Math.max(ans, prod(cand));
        }

        System.out.println(ans);
    }
}
