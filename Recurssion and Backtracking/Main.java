import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().trim();
        String s2 = br.readLine().trim();

        int target = 0;
        for (char c : s1.toCharArray()) {
            if (c == '+') target++;
            else target--;
        }

        int current = 0;
        int unknowns = 0;
        for (char c : s2.toCharArray()) {
            if (c == '+') current++;
            else if (c == '-') current--;
            else if (c == '?') unknowns++;
        }

        int diff = target - current;
        // The unknowns must sum to diff: let's call k = (# of +'s among ?)
        // Then (k - (unknowns - k)) = diff  => 2k - unknowns = diff => k = (diff + unknowns)/2

        if ((diff + unknowns) % 2 != 0) {
            System.out.printf("%.12f\n", 0.0);
            return;
        }
        int k = (diff + unknowns) / 2;
        if (k < 0 || k > unknowns) {
            System.out.printf("%.12f\n", 0.0);
            return;
        }

        // Compute C(unknowns, k) / 2^unknowns
        double ways = 1;
        for (int i = 1; i <= k; i++) {
            ways = ways * (unknowns - k + i) / i;
        }
        double total = 1L << unknowns;  // 2^unknowns
        double probability = ways / total;

        System.out.printf("%.12f\n", probability);
    }
}
