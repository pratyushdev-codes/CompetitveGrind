import java.util.*;

public class counting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        // Sort the array for binary search
        Arrays.sort(A);
        
        // Process Q queries
        for(int q = 0; q < Q; q++){
            int x = sc.nextInt();
            
            // Find the first position where A[pos] >= x
            int pos = lowerBound(A, x);
            
            // Answer is N - pos (number of elements >= x)
            System.out.println(N - pos);
        }
        
        sc.close();
    }
    
    // Binary search to find the first position where A[pos] >= target
    public static int lowerBound(int[] A, int target) {
        int left = 0;
        int right = A.length;
        
        while(left < right) {
            int mid = left + (right - left) / 2;
            
            if(A[mid] >= target) {
                right = mid;  // Found a valid position, try to find earlier one
            } else {
                left = mid + 1;  // Need to go right
            }
        }
        
        return left;
    }
}