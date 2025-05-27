import java.util.*;
public class nChoice {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int C[] = new int[n];
        for(int i = 0; i < n; i++){
            C[i] = sc.nextInt();
        }
        
        int sum = A + B;
        int pos = -1;
        
        for(int i = 0; i < n; i++){
            if(sum == C[i]){
                pos = i + 1;  // Convert to 1-based indexing
                break;
            }
        }
        
        System.out.println(pos);
    }
}