import java.util.*;

public class IntrestingDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices); // Sort prices for binary search

        int Q = sc.nextInt(); // Number of days
        while (Q-- > 0) {
            int val = sc.nextInt(); // Money Vasiliy can spend today
            int low = 0, high = N;

            // Binary search for upper bound
            while (low < high) {
                int mid = (low + high) / 2;
                if (prices[mid] <= val) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            System.out.println(low); // Number of shops with price ≤ val
        }
    }
}
