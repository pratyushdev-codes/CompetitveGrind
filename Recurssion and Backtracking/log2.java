import java.util.Scanner;

public class log2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N = sc.nextLong(); 

        System.out.println(findLog(N));

    }public static  long findLog(long N){
               if (N == 1) {
            return 0;
        }
        return 1 + findLog(N / 2);
    }
}



