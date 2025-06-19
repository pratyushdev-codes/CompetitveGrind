import java.util.*;

public class noldbach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // Generate primes up to n using Sieve of Eratosthenes
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Build list of primes
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }

        // Count "beautiful primes": p = prevPrime + nextPrime + 1
        int count = 0;
        for (int i = 1; i < primes.size(); i++) {
            int a = primes.get(i - 1);
            int b = primes.get(i);
            int sum = a + b + 1;
            if (sum <= n && sum >= 2 && isPrime[sum]) {
                count++;
            }
        }

        System.out.println(count >= k ? "YES" : "NO");
        sc.close();
    }
}
