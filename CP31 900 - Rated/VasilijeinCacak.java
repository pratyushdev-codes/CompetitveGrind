import java.util.Scanner;

public class VasilijeinCacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            
            // sum of k lowest numbers
            long minimum_sum = (k * (k + 1)) / 2;
            
            // sum of k largest numbers
            long maximum_sum = (n * (n + 1)) / 2 - ((n - k) * (n - k + 1)) / 2;
            
            if (x >= minimum_sum && x <= maximum_sum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
