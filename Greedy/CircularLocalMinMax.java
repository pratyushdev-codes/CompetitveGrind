import java.util.*;

public class CircularLocalMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if(n % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            Arrays.sort(a);
            int[] b = new int[n];
            int mid = n / 2;
            int idx = 0;

            // Interleave small and large elements
            for(int i = 0; i < mid; i++) {
                b[idx] = a[i];
                idx += 2;
            }

            idx = 1;
            for(int i = mid; i < n; i++) {
                b[idx] = a[i];
                idx += 2;
            }

            // Validate the arrangement
            boolean isValid = true;
            for(int i = 0; i < n; i++) {
                int prev = b[(i - 1 + n) % n];
                int next = b[(i + 1) % n];

                if(!((b[i] > prev && b[i] > next) || (b[i] < prev && b[i] < next))) {
                    isValid = false;
                    break;
                }
            }

            if(isValid) {
                System.out.println("YES");
                for(int val : b) {
                    System.out.print(val + " ");
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
