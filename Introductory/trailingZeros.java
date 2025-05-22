import java.util.*;
public class trailingZeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int p =0;
        int num =5;
        while(n>0){
            p+=n/num;
            n/=num;
        }
        System.out.println(p);
    }


}
