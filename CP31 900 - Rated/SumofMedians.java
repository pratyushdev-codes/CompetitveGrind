import java.util.Scanner;

public class SumofMedians {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
 
            long[] v = new long[(int)(n * k)];
            for (int i = 0; i < n * k; i++) {
                v[i] = sc.nextLong();
            }
 
            long pointer = n * k;
            long sum = 0;
 
            while (k-- > 0) {
                pointer -= (n / 2 + 1);
                sum += v[(int)pointer];
            }
 
            System.out.println(sum);
        }
 
        sc.close();
    }
}