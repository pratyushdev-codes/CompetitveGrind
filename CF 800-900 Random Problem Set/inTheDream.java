
// First half scores = (a, b)
// Second half increments = (c - a, d - b)

// If a = 0, b = X with X ≥ 3, then team K scored X consecutive goals → invalid.

// If b = 0, a = X with X ≥ 3, then team R scored X consecutive goals → invalid.

// Same check applies for the second half (c-a, d-b).

// Otherwise, it’s always possible, because we can always interleave goals to avoid 3 consecutive goals.
import java.util.Scanner;

public class inTheDream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            
            // First half: (a, b)
            // Second half: (c - a, d - b)
            boolean firstHalfValid = isValid(a, b);
            boolean secondHalfValid = isValid(c - a, d - b);
            
            if (firstHalfValid && secondHalfValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
    
    private static boolean isValid(int x, int y) {
        return x <= 2 * (y + 1) && y <= 2 * (x + 1);
    }
}