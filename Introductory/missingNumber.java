import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += sc.nextInt();
        }
        long totalSum = n * (n + 1) / 2;
        System.out.println(totalSum - sum);
        sc.close();
    }
}
