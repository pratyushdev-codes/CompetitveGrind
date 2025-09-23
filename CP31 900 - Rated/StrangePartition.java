import java.util.Scanner;

public class StrangePartition {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long[] a = new long[(int)n];
            
            long min = 0, max = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            for (int i = 0; i < n; i++) {
                max += (long)Math.ceil((a[i] * 1.0) / x);
                min += a[i];
            }
            
            min = (long)Math.ceil((min * 1.0) / x);
            System.out.println(min + " " + max);
        }
        
        sc.close();
    }
}