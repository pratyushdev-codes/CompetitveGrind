import java.util.Scanner;

public class BachGoldProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 1) {
            n /= 2;
            n--;
            System.out.println(n + 1);
            System.out.print("3 ");
        } else {
            n /= 2;
            System.out.println(n);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("2 ");
        }

        System.out.println();
        sc.close();
    }
}
