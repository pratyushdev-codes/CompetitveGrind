import java.util.*;
public class LetterHome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); // size of the array
            int s = sc.nextInt(); // starting position 
            int arr[]= new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int L = arr[0];       // leftmost
            int R = arr[n-1];     // rightmost

            // Correct possible Paths
            int option1 = Math.abs(s - L) + (R - L);
            int option2 = Math.abs(s - R) + (R - L);

            int ans = Math.min(option1, option2);
            System.out.println(ans);
        }
    }
}
