import java.util.*;
public class StableGroups {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        long x = sc.nextLong();

        long[] v = new long[(int) n];
        for (int i = 0; i < n; i++) { // O(N)
            v[i] = sc.nextLong();
        }

        Arrays.sort(v); // O(N log N)

        List<Long> differences = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (v[i + 1] - v[i] > x) {
                differences.add(v[i + 1] - v[i]);
            }
        } // O(N)

        Collections.sort(differences); // O(N log N)

        int ans = differences.size() + 1;

        for (long difference : differences) {
            long val = (difference / x) + ((difference % x != 0) ? 1 : 0) - 1; 
            // equivalent to ceil(difference / x) - 1

            if (k >= val) {
                ans--;
                k -= val;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}

// Total time complexity : O(N log N)
// Total space complexity : O(N)