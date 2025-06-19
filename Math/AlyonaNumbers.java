import java.util.*;
public class AlyonaNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        long Xrem[] = new long[5];
        long Yrem[] = new long[5];
        Arrays.fill(Xrem, 0);
        Arrays.fill(Yrem, 0);

        // Count remainders for numbers from 1 to x
        for(int i = 1; i <= x; i++) {
            Xrem[i % 5] = Xrem[i % 5] + 1;
        }
        
        // Count remainders for numbers from 1 to y
        for(int i = 1; i <= y; i++) {
            Yrem[i % 5] = Yrem[i % 5] + 1;
        }
        
        long ans = 0;
        for(int i = 0; i < 5; i++) {
            if(i == 0) {
                ans += Xrem[i] * Yrem[i];
            } else {
                ans += Xrem[i] * Yrem[5 - i];
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}