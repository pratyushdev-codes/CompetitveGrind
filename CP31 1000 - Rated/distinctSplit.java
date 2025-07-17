import java.util.HashSet;
import java.util.Scanner;

public class distinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            HashSet<Character> set = new HashSet<>();
            int[] prefixCount = new int[n + 1];
            int[] suffixCount = new int[n + 1];

            // Compute prefixCount (1-based)
            for (int i = 1; i <= n; i++) {
                set.add(str.charAt(i - 1));
                prefixCount[i] = set.size();
            }

            set.clear(); // Clear for suffix computation

            // Compute suffixCount (1-based)
            for (int i = n; i >= 1; i--) {
                set.add(str.charAt(i - 1));
                suffixCount[i] = set.size();
            }

            long ans = 0;
            // Check all possible splits (0 to n)
            for (int i = 0; i <= n; i++) {
                ans = Math.max(ans, prefixCount[i] + suffixCount[i + 1]);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}