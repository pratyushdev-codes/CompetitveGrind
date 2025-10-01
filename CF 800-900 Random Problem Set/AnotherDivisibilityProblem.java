import java.util.Scanner;

public class AnotherDivisibilityProblem {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long x = sc.nextInt();

            int d = String.valueOf(x).length();

            long y = (long)Math.pow(10, d)-x;


            System.out.println(y);

        }
        sc.close();
    }
}