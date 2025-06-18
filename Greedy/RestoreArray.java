import java.util.Scanner;

public class RestoreArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] ans = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                ans[i] = Math.min(arr[i], arr[i + 1]);
            }

            for (int i = 0; i < ans.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println(); 
        }

        sc.close();
    }
}
