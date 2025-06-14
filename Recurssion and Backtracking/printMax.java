import java.util.*;;
public class printMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A [] = new int [N];
        for(int i = 0 ; i < N ; i++){
           A[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        dp[0] = A[0];

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i - 1], A[i]);
        }

        System.out.println(dp[N - 1]);

        }
}
