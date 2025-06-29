import java.security.Key;
import java.util.*;
public class kthnotdivisblebyN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            

            if(k<n){
                System.out.println(k);
                continue;
            }   
            int ans = k+(k/(n-1));


            if(ans%n==0){
               ans--;
            }
                System.out.println(ans);
        }
    }
}
