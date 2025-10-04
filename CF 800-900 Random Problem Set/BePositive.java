import java.util.Scanner;

public class BePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            int zero_count = 0;
            int neg_count = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    zero_count++;
                } else if (arr[i] == -1) {
                    neg_count++;
                }
            }
            
            int ans;
            if (neg_count % 2 == 0) {
                // Just turn all zeros into ones
                ans = zero_count;
            } else {
                if (zero_count > 0) {
                    // Use one zero to fix parity + turn remaining zeros into ones
                    ans = zero_count + 1;
                } else {
                    // No zero available, must flip one -1 into 1 (cost 2)
                    ans = 2;
                }
            }
            
            System.out.println(ans);
        }
    }
}
