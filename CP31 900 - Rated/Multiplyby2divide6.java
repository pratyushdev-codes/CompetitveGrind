import java.util.Scanner;

public class Multiplyby2divide6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            int n= sc.nextInt();
            int countof3 =0;
            int countof2 = 0;
            // Count how many times n can be divided by 3 log3(n)
            while(n>0 && n%3==0){
                countof3++;
                n/=3;
            }
            // Count how many times n can be divided by 2 // log2(n)
            while(n>0 && n%2==0){
                countof2++;
                n/=2;
            }

            if(n>1 || countof2>countof3){
                System.out.println(-1);
            }else{
                System.out.println(countof3+ (countof3-countof2));
            }
        }
        sc.close();;
    }
}
