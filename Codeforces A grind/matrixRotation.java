import java.util.Scanner;

public class matrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a, b, c, d;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
            
            if ((a < b && c < d && a < c && b < d) || 
                (c < a && d < b && c < d && a < b) || 
                (d < c && b < a && d < b && c < a) || 
                (b < d && a < c && b < a && d < c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}