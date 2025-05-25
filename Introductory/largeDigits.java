
import java.util.Scanner;

public class largeDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(calculateSum(A)>calculateSum(B)){
            System.out.println(calculateSum(A));
        }else{
                System.out.println(calculateSum(B));
            }


    }public static int calculateSum(int X){
        int sum=0;
        while(X>0){
            sum+=X%10;
            X/=10;
    }
    return sum;
}
}