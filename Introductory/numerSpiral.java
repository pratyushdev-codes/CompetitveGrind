import java.util.Scanner;

public class numerSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) {
            long y = sc.nextLong();
            long x = sc.nextLong();

            long maxi = Math.max(x, y);
            long square = (maxi - 1) * (maxi - 1);

            if (maxi % 2 == 0) {
                if (x > y) {
                    System.out.println(square + y);
                } else {
                    System.out.println((maxi * maxi) - x + 1);
                }
            } else {
                if (x > y) {
                    System.out.println((maxi * maxi) - y + 1);
                } else {
                    System.out.println(square + x);
                }
            }
        }

        sc.close();
    }
}
