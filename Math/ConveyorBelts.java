import java.util.*;
import java.io.*;

public class ConveyorBelts {
    
    // Find which ring a cell (x, y) belongs to
    static int getRing(int x, int y, int n) {
        int distFromEdge = Math.min(Math.min(x - 1, y - 1), Math.min(n - x, n - y));
        return distFromEdge;
    }
    
    // Get position within the ring (0-indexed)
    static long getPositionInRing(int x, int y, int n) {
        int ring = getRing(x, y, n);
        int size = n - 2 * ring;
        
        // Top row
        if (x == ring + 1 && y >= ring + 1 && y <= n - ring) {
            return y - ring - 1;
        }
        // Right column  
        if (y == n - ring && x >= ring + 1 && x <= n - ring) {
            return (size - 1) + (x - ring - 1);
        }
        // Bottom row (right to left)
        if (x == n - ring && y >= ring + 1 && y <= n - ring) {
            return (size - 1) + (size - 1) + (n - ring - y);
        }
        // Left column (bottom to top)
        if (y == ring + 1 && x >= ring + 1 && x <= n - ring) {
            return (size - 1) + (size - 1) + (size - 1) + (n - ring - x);
        }
        
        return 0;
    }
    
    // Get perimeter of a ring
    static long getRingPerimeter(int ring, int n) {
        if (ring >= n / 2) return 1;
        int size = n - 2 * ring;
        if (size <= 1) return 1;
        return 4L * (size - 1);
    }
    
    static int solve(long n, long x1, long y1, long x2, long y2) {
        long ring1 = getRing(x1, y1, n);
        long ring2 = getRing(x2, y2, n);
        
        // Minimum energy is the difference in ring numbers
        return (int)Math.abs(ring1 - ring2);
    }
    
    // Find which ring a cell (x, y) belongs to
    static long getRing(long x, long y, long n) {
        long distFromEdge = Math.min(Math.min(x - 1, y - 1), Math.min(n - x, n - y));
        return distFromEdge;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int x1 = Integer.parseInt(parts[1]);
            int y1 = Integer.parseInt(parts[2]);
            int x2 = Integer.parseInt(parts[3]);
            int y2 = Integer.parseInt(parts[4]);
            
            System.out.println(solve(n, x1, y1, x2, y2));
        }
    }
}