import java.util.Scanner;

public class BuyingTorches {
    public static long ceilDivision(long a, long b) {
        return (a + b - 1) / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long k = scanner.nextLong();

            long sticksGainedPerTrade = x - 1; // if we give 1 stick and get x back, we gain x-1 sticks

            // 1 torch = 1 stick + 1 coal
            long sticksNeeded = k * y + k - 1;

            long trades = 0;
            trades += ceilDivision(sticksNeeded, sticksGainedPerTrade); // gaining required sticks
            trades += k;                                                 // using required sticks to get k coal

            System.out.println(trades);
        }
        scanner.close();
    }
}