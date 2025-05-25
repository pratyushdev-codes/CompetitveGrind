import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class KcommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        // Find all common divisors
        List<Integer> commonDivisors = new ArrayList<>();
        int small = Math.min(A, B);
        
        for (int i = 1; i <= small; i++) {
            if (A % i == 0 && B % i == 0) {
                commonDivisors.add(i);
            }
        }
        
        // Sort in descending order to get largest first
        Collections.sort(commonDivisors, Collections.reverseOrder());
        
        // Print the K-th largest (K-1 index since 0-based)
        System.out.println(commonDivisors.get(K - 1));
        
        sc.close();
    }
}