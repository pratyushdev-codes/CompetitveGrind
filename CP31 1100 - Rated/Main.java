import java.util.*;

public class Main {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long[] v = new long[(int) n];
        for (int i = 0; i < n; i++) { // n
            v[i] = sc.nextLong();
        }

        Arrays.sort(v); // nlogn

        if (v[0] != 1) {
            System.out.println("No");
            return;
        }

        long sum = 1;
        for (int i = 1; i < n; i++) { // n
            if (v[i] > sum) {
                System.out.println("No");
                return;
            }
            sum += v[i];
        }

        System.out.println("Yes");
        // T.C :- O(nlogn)
        // S.C :- O(n)
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
