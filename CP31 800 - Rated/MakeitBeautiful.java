import java.util.Arrays;
import java.util.Scanner;

public class MakeitBeautiful {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i =0; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int max = arr[n-1];
            int min = arr[0];

            if(min==max){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                System.out.print(max + " ");
                for(int i =0 ; i < n-1; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}