import java.util.Scanner;

public class printNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNums(1, N);  // Start from 1 and go up to N
    }

    public static void printNums(int current, int N) {
        if (current > N) {
            return;
        }

        System.out.println(current );
        printNums(current + 1, N);
    }
}
