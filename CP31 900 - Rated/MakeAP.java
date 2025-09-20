// Explanation:
// Case 1: We require new_a = 2*b - c to be divisible by a and positive. Also, new_a must be at least a (so that m >= 1).

// Case 2: We require (a + c) to be even so that (a+c)/2 is an integer. Then new_b = (a+c)/2 must be divisible by b and positive, and at least b.

// Case 3: Similarly, new_c = 2*b - a must be divisible by c and positive, and at least c.

import java.util.Scanner;

public class MakeAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            
            boolean answer = false;
            
            // Case 1: multiply a by m
            long new_a = 2 * b - c;
            if (new_a >= a && new_a % a == 0 && new_a > 0) {
                answer = true;
            }
            
            // Case 2: multiply b by m
            if ((a + c) % 2 == 0) {
                long new_b = (a + c) / 2;
                if (new_b >= b && new_b % b == 0 && new_b > 0) {
                    answer = true;
                }
            }
            
            // Case 3: multiply c by m
            long new_c = 2 * b - a;
            if (new_c >= c && new_c % c == 0 && new_c > 0) {
                answer = true;
            }
            
            System.out.println(answer ? "YES" : "NO");
        }
        scanner.close();
    }
}