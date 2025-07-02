import java.util.Scanner;

public class SportMafia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // total number of actions
        long k = sc.nextLong(); // candies left at the end

        long low = 1;
        long high = n;
        long answer = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            // total candies added: 1 + 2 + ... + mid = mid*(mid+1)/2
            long totalAdded = mid * (mid + 1) / 2;

            // candies eaten = n - mid
            long eaten = n - mid;

            long finalCandies = totalAdded - eaten;

            if (finalCandies >= k) {
                answer = eaten; // this might be our answer, try smaller put count
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
