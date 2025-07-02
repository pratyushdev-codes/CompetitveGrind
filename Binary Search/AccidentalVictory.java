import java.util.*;
import java.io.*;

public class AccidentalVictory {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            long[] f = new long[n + 1]; // original array (1-indexed)
            long[] s = new long[n + 1]; // sorted array (1-indexed)
            
            for (int i = 1; i <= n; i++) {
                f[i] = sc.nextLong();
                s[i] = f[i];
            }
            
            // Sort the array s from index 1 to n
            Arrays.sort(s, 1, n + 1);
            
            int cnt = 0;
            long sum = 0;
            
            // Find the first position where s[i] > sum
            for (int i = 1; i <= n; i++) {
                if (s[i] > sum) {
                    cnt = i;
                }
                sum += s[i];
            }
            
            System.out.println(n - cnt + 1);
            
            // Print indices of elements that can win
            for (int i = 1; i <= n; i++) {
                if (f[i] >= s[cnt]) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}