import java.util.*;

public class StringTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
     
 
        


    

    
        
        // Find the smallest character in the string
        char minChar = s.charAt(0);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < minChar) {
                minChar = s.charAt(i);
            }
        }
        
        // If the first character is already the smallest, 
        // we need to find the best position to move
        if (s.charAt(0) == minChar) {
            // Look for the first position where we can improve
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    // Move character at position i to the beginning
                    return s.charAt(i) + s.substring(0, i) + s.substring(i + 1);
                }
            }
            // If no improvement is possible, move the last character
            return s.charAt(n - 1) + s.substring(0, n - 1);
        } else {
            // Find the first occurrence of the minimum character and move it to front
            for (int i = 0; i < n; i++)
}

        }

    }