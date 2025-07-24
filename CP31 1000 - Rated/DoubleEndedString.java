import java.util.Scanner;

public class DoubleEndedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        
        while (t-- > 0) {
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            long n = A.length(), m = B.length();
            long lcs = 0;

            for (long len = 1; len <= Math.min(n, m); len++) {
                for (long i = 0; i + len <= n; i++) {
                    for (long j = 0; j + len <= m; j++) {
                        String extractA = A.substring((int)i, (int)(i + len));
                        String extractB = B.substring((int)j, (int)(j + len));
                        
                        if (extractA.equals(extractB)) {
                            lcs = Math.max(lcs, len);
                        }
                    }
                }
            }

            long operations = n + m - 2 * lcs;
            System.out.println(operations);
        }
    }
}


// if constratints are large, we can optimize the LCS calculation using dynamic programming and then minus it from the collective lengths of both the string