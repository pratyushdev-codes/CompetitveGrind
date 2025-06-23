import java.util.*;

public class GCDProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = 1;
            int a, b;
            if(n == 1){
                System.out.println("1 1");
            } else {
                for(int i = 2; i <= n; i++){
                    a = n * i + 1;
                    b = n * c + 1;
                    if(gcd(a, b) == 1){
                        System.out.println(a + " " + b);
                        break;
                    }
                    c++;
                }
            }
        }
    }public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
