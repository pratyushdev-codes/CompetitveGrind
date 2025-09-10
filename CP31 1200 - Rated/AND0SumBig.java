import java.util.Scanner;

public class AND0SumBig {
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // base
            int k = sc.nextInt(); // exponent

            long ans = 1;
            for (int i = 0; i < k; i++) {
                ans = (ans * n) % MOD;
            }

            System.out.println(ans);
        }
    }
}
