import java.util.Scanner;

public class printDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
                    long N = sc.nextLong();

         print(N);
         System.out.println();
        }


    }public static void print(long n){
        if (n == 0)
            return;

        print(n / 10);    
        System.out.print(n % 10 + " ");  
     
     }
}
