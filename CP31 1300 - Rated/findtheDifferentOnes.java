import java.util.*;

public class findtheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] previousDifferent = new int[n];
            Arrays.fill(previousDifferent, -1);

            int prev = -1;
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1]) {
                    prev = i - 1;
                }
                previousDifferent[i] = prev;
            }

            int q = sc.nextInt();
            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                if (previousDifferent[r - 1] >= l - 1) {
                    // add +1 because problem wants 1-based indices
                    System.out.println(r + " " + (previousDifferent[r - 1] + 1));
                } else {
                    System.out.println("-1 -1");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
