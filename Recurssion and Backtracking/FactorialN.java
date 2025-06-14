import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(fact(N));

    }public static long fact(long N){
        if (N == 1) {
            return N;
        }
        return N*fact(N-1);
        }
    }
