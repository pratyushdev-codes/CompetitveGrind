import java.util.*;

public class Subtraction {

    static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();

        long[] v = new long[(int) n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        // Using HashSet instead of map<ll,bool>
        Set<Long> set = new HashSet<>();
        for (long val : v) {
            set.add(val);
        }

        for (long val : v) {
            if (set.contains(val - k)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}

