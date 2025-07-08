import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int longestLength = 0;
            int currLen = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    currLen++;
                    longestLength = Math.max(longestLength, currLen);
                } else {
                    currLen = 0;
                }
            }

            System.out.println(longestLength);
        }
    }
}
