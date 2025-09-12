import java.util.*;

public class DivisiblePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt(); // O(n)
            }

            int[] rem = new int[m];
            for (int i = 0; i < n; i++) {
                rem[v[i] % m]++; // O(n)
            }

            int ans = 0;

            for (int i = 0; i < m; i++) {
                int x = rem[i], y = rem[(m - i) % m];

                if (x == 0 && y == 0) continue;

                int tmp = Math.min(x, y);

                x -= Math.min(tmp + 1, x);
                y -= Math.min(tmp + 1, y);

                ans++; // one group formed
                ans += (x + y); // leftover elements

                rem[i] = 0;
                rem[(m - i) % m] = 0;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
