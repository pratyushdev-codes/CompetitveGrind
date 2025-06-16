import java.util.*;

public class TCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();

     
       System.out.println(findFactorial(n, r));
    }

    public static long findFactorial(long n, long r) {
       
    if (r == 0)
    {
        return 1;
    }
    else
    {
        return ((n * findFactorial(n - 1, r - 1)) / r);
    }
}
}
