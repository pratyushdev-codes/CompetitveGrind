import java.util.*;

public class kalindromeArray {

    // Function to check if after removing all 'x', array is palindrome
    static boolean check(List<Long> a, long x) {
        List<Long> b = new ArrayList<>();
        for (long num : a) {
            if (num != x) {
                b.add(num);
            }
        }

        int m = b.size();
        for (int i = 0; i < m; i++) {
            if (!b.get(i).equals(b.get(m - i - 1))) {
                return false;
            }
        }
        return true;
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }

        for (int i = 0; i < n; i++) {
            if (!a.get(i).equals(a.get(n - i - 1))) {
                if (check(a, a.get(i)) || check(a, a.get(n - i - 1))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 1;
        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
