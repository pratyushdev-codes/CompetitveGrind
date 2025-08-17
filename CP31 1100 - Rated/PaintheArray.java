import java.util.*;
import java.io.*;

public class PaintheArray {
    // Function to find gcd of two numbers
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        // For fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim()); // number of test cases
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim()); // size of array
            long[] v = new long[n];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) { // input array
                v[i] = Long.parseLong(st.nextToken());
            }

            long gcd1 = 0, gcd2 = 0;

            // Calculate gcd1 from even indices, gcd2 from odd indices
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 1) { // odd index
                    gcd2 = gcd(gcd2, v[i]);
                } else { // even index
                    gcd1 = gcd(gcd1, v[i]);
                }
            }

            boolean flag = true;

            // Check if gcd1 divides any odd index element
            for (int i = 1; i < n; i += 2) {
                if (v[i] % gcd1 == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                output.append(gcd1).append("\n");
                continue;
            }

            flag = true;
            // Check if gcd2 divides any even index element
            for (int i = 0; i < n; i += 2) {
                if (v[i] % gcd2 == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                output.append(gcd2).append("\n");
            } else {
                output.append(0).append("\n");
            }
        }

        System.out.print(output);
    }
}
