import java.util.*;

public class MochandMath {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i =0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int x = arr[n-1];
            for(int i = n-2;  i>=0 ; i--){
                x= x&arr[i];
            }
            System.out.println(x);

        }   
    }
}
