import java.util.Scanner;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // size of permutation
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print((n + 1 - a[i]) + " ");
            }
            System.out.println(); // move to next line after each test case
        }
        
        sc.close();
    }
}
