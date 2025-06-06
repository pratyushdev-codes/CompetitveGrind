import java.util.*;
public class polycarpandCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt(); // in put 
            int r= N/3;
            int rem = N%3;
            int one = r;
            int two = r;
            if(rem==1) one++;
             else if (rem==2) two++;
             System.out.println(one+" "+two);

        }
    }
}
