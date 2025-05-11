import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long value = 2;

        if (n == 2 || n == 3) {
            System.out.print("NO SOLUTION");
            return;
        }

        // Print even numbers first
        while (value <= n) {
            System.out.print(value + " ");
            value += 2;
        }

        value = 1;

        // Then print odd numbers
        while (value <= n) {
            System.out.print(value + " ");
            value += 2;
        }

        sc.close();
    }
}
