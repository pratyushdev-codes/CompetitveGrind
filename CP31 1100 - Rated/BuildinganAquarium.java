import java.util.Scanner;

public class BuildingAnAquarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long start = 1;  // Changed to long to handle large numbers
            long end = (long) 1e12;  // Changed to long
            long ans = -1;
            
            while (start <= end) {
                long mid = start + (end - start) / 2;
                if (check(a, x, mid)) {
                    ans = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean check(int[] a, long x, long mid) {  // Changed parameters
        long units = 0;  // Changed to long
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] < mid) {
                units += (mid - a[i]);
            }
        }
        return units <= x;  // Compare with x, not mid
    }
}