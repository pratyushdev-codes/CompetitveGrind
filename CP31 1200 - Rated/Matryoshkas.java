import java.util.*;

public class Matryoshkas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

 
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Use TreeMap for sorted order (like C++ map)
        Map<Integer, Integer> hm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }

        int ans = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int ele = entry.getKey();
            int freq = entry.getValue();

            int prevFreq = hm.getOrDefault(ele - 1, 0);
            ans += Math.max(0, freq - prevFreq);
        }

        System.out.println(ans);
        sc.close();
    }
           }
}

//! Time complexity: O(N log N)
//! Space complexity: O(N)
