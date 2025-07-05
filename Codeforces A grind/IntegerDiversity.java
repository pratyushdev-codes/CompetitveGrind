import java.util.*;
import java.io.*;

public class IntegerDiversity {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<Integer, Integer> mp = new HashMap<>();
            int zero = 0;
            
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(input[i]);
                if (x == 0) {
                    zero++;
                    continue;
                }
                mp.put(Math.abs(x), mp.getOrDefault(Math.abs(x), 0) + 1);
            }
            
            int ans = (zero > 0) ? 1 : 0;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                ans += Math.min(2, (entry.getValue() + 2) / 2);
            }
            
            pw.println(ans);
        }
        
        pw.close();
    }
}