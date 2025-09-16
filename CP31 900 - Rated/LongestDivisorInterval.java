import java.util.Scanner;

public class LongestDivisorInterval {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t= sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            int i =1;
            while(n%i==0){
                i++;
            }
            System.out.println(-1);
        }
        sc.close();
    }
}