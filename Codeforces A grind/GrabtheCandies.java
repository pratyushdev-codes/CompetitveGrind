import java.util.Scanner;

public class GrabtheCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a [] = new int [n];
             int x =0;
            int y = 0;
            for(int i =0 ; i< n ; i++){
                a[i] = sc.nextInt();
                if(a[i]%2==0){
                        x+=a[i];
                }else{
                    y+=a[i];
                }
            }

            if(x>y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
