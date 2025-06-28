import java.util.Scanner;
public class PermutationSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1]; // 1-based indexing

            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
            }

            int g = 0;
            for (int i = 1; i <= n; i++) {
                if (p[i] != i) {
                    int d = Math.abs(i - p[i]);
                    g = gcd(g, d);
                }
            }

            System.out.println(g);
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}


// g starts at 0.

// For each position i (1‑indexed), if the element isn’t already in place (p[i] != i), compute the distance d = |i – p[i]|—how far the element must travel.

// Update g = gcd(g, d).

// At the end, return g.
