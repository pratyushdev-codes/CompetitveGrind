import java.util.Scanner;

public class SumofGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int l = 1; l <= K; l++) {
                    ans += gcd(i, gcd(j, l));
                }
            }
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
