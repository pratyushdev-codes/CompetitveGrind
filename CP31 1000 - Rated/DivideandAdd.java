import java.util.Scanner;

public class DivideandAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            long ans = Integer.MAX_VALUE;
            
            for (int addition = 0; addition < 32; addition++) {
                long operations = addition;
                long newB = b + addition;
                
                if (newB == 1) // corner case
                    continue;
                
                long copyA = a;
                while (copyA > 0) {
                    copyA /= newB;
                    operations++;
                }
                
                ans = Math.min(ans, operations);
            }
            
            System.out.println(ans);
        }
    }
}