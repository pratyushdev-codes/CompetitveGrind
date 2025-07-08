import java.util.Scanner;

public class customizingTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a [] = new int [n];
            int sum =0;
            for(int i =0 ; i < n ; i++){
                a[i] = sc.nextInt();
                sum+= a[i];
            }
            int x = sum%n;
            int res = x*(n-x);
            System.out.println(res);


            
        }
    }
}
