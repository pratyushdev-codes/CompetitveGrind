import java.util.Scanner;

public class printRecurssion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        print(N);
    }public static void print(int N){
        if(N>0){
            System.out.println("I love Recursion");
            print(N-1);
        }
    }
}
