import java.util.*;

public class PlusMinusPermutation {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;  // avoid overflow
    }

    static long calculateSum(long start, long end) {
        if (start > end) return 0;
        long count = end - start + 1;
        return (start + end) * count / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long lcmXY = lcm(x, y);

            long count1 = (n / x) - (n / lcmXY); // indices divisible by x only
            long count2 = (n / y) - (n / lcmXY); // indices divisible by y only

            long sumX = calculateSum(n - count1 + 1, n); // largest count1 numbers
            long sumY = calculateSum(1, count2);         // smallest count2 numbers

            long ans = sumX - sumY;
            System.out.println(ans);
        }

        sc.close();
    }
}
