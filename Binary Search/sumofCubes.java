import java.util.*;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // Precompute cubes up to a limit
        int N = 10000; // cube of 10000 is 1e12, which is safe
        HashSet<Long> cubes = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            cubes.add(1L * i * i * i);
        }

        while (t-- > 0) {
            long x = sc.nextLong();
            boolean found = false;
            for (int i = 1; i <= N; i++) {
                long a = 1L * i * i * i;
                if (a > x) break;
                if (cubes.contains(x - a)) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}
