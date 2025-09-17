import java.util.Scanner;

public class notDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // performing the first set of n operations
            // Special case for 1:
            // If any a[i] == 1, it creates a big problem:
            // Since x % 1 == 0 for any integer x, the condition always fails when the left element is 1.
            // To fix this, we immediately increment every 1 to 2.
            // That’s why the code first changes all 1s to 2.
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    arr[i]++;
                }
            }

            // now checking other things
            // If arr[i+1] % arr[i] == 0, then increment arr[i+1] to break divisibility
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] % arr[i] == 0) {
                    arr[i + 1]++;
                }
            }

            // printing the final array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// tc - O(n) = O(10^4)
// sc - O(n) = O(10^4)
