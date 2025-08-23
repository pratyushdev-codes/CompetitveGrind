import java.util.*;

public class AssemblyViaMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = (n * (n - 1)) / 2; // size of array b
            
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            
            Arrays.sort(b); // sort the array
            
            int x = n - 1; // frequency pattern
            int idx = 0;
            
            // Build the array a
            for (int i = 0; i < n - 1; i++) {
                System.out.print(b[idx] + " ");
                idx += x; // skip the correct number of times
                x--;
            }
            
            // Add a very large number for the last element
            System.out.println(1000000000);
        }
        
        sc.close();
    }
}
