import java.util.Scanner;

public class avatoBus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            
            long n = sc.nextLong();
            if(n%2==1){
                System.out.println(-1);
            }else{
                n/=2;
    
                System.out.println(((n + 3 - 1) / 3) + " " + (n / 2));

            }
        }
    }
}
