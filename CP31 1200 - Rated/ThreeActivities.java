import java.util.*;
import java.io.*;

public class ThreeActivities {

    static List<Integer> findMax3(int[] arr) {
        int n = arr.length;
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tmp.add(new int[]{arr[i], i}); // {value, index}
        }
        tmp.sort((p1, p2) -> Integer.compare(p2[0], p1[0])); // sort descending by value

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 3 && i < tmp.size(); i++) {
            ans.add(tmp.get(i)[1]); // store indices of top 3
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) c[i] = sc.nextInt();

            List<Integer> maxa = findMax3(a);
            List<Integer> maxb = findMax3(b);
            List<Integer> maxc = findMax3(c);

            int ans = 0;
            for (int x : maxa) {
                for (int y : maxb) {
                    for (int z : maxc) {
                        if (x == y || y == z || z == x) continue;
                        ans = Math.max(ans, a[x] + b[y] + c[z]);
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb.toString());
    }

    // Fast input for CF-style problems
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
