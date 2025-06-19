import java.util.Scanner;

public class primeSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            if(x-y>1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            
            }
        }
    }
}
