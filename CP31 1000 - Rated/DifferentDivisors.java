import java.util.ArrayList;
import java.util.Scanner;

public class DifferentDivisors {
    public static void main(String[] args) {
        ArrayList<Long> primes = new ArrayList<>();
        for (long i = 2; i <= 100000; i++) { // O(10^5)
            boolean isPrime = true;
            for (long j = 2; j * j <= i; j++) { // O(sqrt(10^5)) = O(10^2)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        // O(10^5 * 10^2) = O(10^7)

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) { // O(3000)
            long d = scanner.nextLong();

            long p = -1;
            for (int i = 0; i < primes.size(); i++) { // O(9000)
                if (primes.get(i) >= (1 + d)) {
                    p = primes.get(i);
                    break;
                }
            }
            long q = -1;
            for (int i = 0; i < primes.size(); i++) { // O(9000)
                if (primes.get(i) >= (p + d)) {
                    q = primes.get(i);
                    break;
                }
            }

            long a = Math.min(p * p * p, p * q);
            System.out.println(a);
        }
        scanner.close();
    }
}