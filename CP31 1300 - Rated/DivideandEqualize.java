import java.util.*;

public class DivideandEqualize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Map<Integer, Integer> mp = new HashMap<>();
            
            for (int i = 0; i < n; i++) {  // O(n * sqrt(a[i]))
                int num = a[i];
                for (int j = 2; j * j <= num; j++) {
                    while (num % j == 0) {
                        mp.put(j, mp.getOrDefault(j, 0) + 1);
                        num /= j;
                    }
                }
                if (num > 1) {
                    mp.put(num, mp.getOrDefault(num, 0) + 1);
                }
            }
            
            boolean flag = true;
            for (int val : mp.values()) {
                if (val % n != 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
