import java.util.Scanner;

public class countBalls {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total= a+b;
        int segment = n/total;
        System.out.println(segment*a+ Math.min(a, n%total));
        sc.close();
    }
}
