import java.util.*;
import java.io.*;

public class monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            List<Pair> healthPoints = new ArrayList<>();
            
            for (long i = 0; i < n; i++) {
                long x = sc.nextLong();
                healthPoints.add(new Pair(x % k == 0 ? k : x % k, i + 1));
            }
            
            Collections.sort(healthPoints, new Comparator<Pair>() {
                @Override
                public int compare(Pair a, Pair b) {
                    if (a.first != b.first) {
                        return Long.compare(b.first, a.first); // descending order
                    } else {
                        return Long.compare(a.second, b.second); // ascending order
                    }
                }
            });
            
            for (Pair p : healthPoints) {
                System.out.print(p.second + " ");
            }
            System.out.println();
        }
    }
    
    static class Pair {
        long first, second;
        
        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
}