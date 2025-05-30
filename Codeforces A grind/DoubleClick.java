import java.util.*;
public class DoubleClick {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
 
        int D = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans =-1;
        for(int i =1 ; i< n ; i++){
            if(arr[i]- arr[i-1]<=D){
                ans= arr[i];
                break;

            }
        }
        System.out.println(ans);
        sc.close();
    }
}