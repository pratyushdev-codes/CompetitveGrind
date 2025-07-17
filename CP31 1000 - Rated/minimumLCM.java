import java.util.Scanner;

public class minimumLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans_a = 1;
            long ans_b = n - 1;
            
            for (long fac = 2; fac * fac <= n; fac++) { // sqrt n
                if (n % fac == 0) {
                    ans_a = n / fac;
                    ans_b = n - ans_a;
                    break;
                }
            }
            
            System.out.println(ans_a + " " + ans_b);
        }
        
        sc.close();
    }
}
// tc = O(sqrt(10^9)) = O(10^4)
// sc = O(1)