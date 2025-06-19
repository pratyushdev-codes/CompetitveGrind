import java.util.*;

public class KFactorization {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        ArrayList<Long> ls = new ArrayList<>();

        for(long i = 2; i <= n;){
            if(ls.size()==k-1){
                ls.add(n);
                break;
            }

            if(n%i==0){
                ls.add(i);
                n/=i;
            }else{
                i++;
            } if (ls.size() == k) {
            for (long factor : ls) {
                System.out.print(factor + " ");
            }
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
}
