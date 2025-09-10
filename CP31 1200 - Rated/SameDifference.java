import java.util.HashMap;
import java.util.Scanner;

public class SameDifference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr [] = new int [n];
            for(int i =0 ; i < n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i =0; i < n ; i++){
                arr[i] = arr[i]-i;
            }

            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0 ; i < n ; i++){
                hm.put(arr[i], hm.getOrDefault(hm, 0)+1);
            }
        }
    }
}
