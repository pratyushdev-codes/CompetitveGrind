public import java.util.*;

public class AddOrXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            if (b < a) {
                if ((a ^ 1) == b) {
                    System.out.println(y);
                } else {
                    System.out.println(-1);
                }
                continue;
            }

            long diff = b - a;

            // If increment-only is cheaper
            if (y > x) {
                System.out.println(diff * x);
                continue;
            }

            long ans = (diff / 2) * (x + y);
            if (diff % 2 == 1) {
                if ((a & 1) == 1) {
                    ans += x;
                } else {
                    ans += y;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
 {
    
}
