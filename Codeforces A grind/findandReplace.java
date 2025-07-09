import java.util.*;
import java.io.*;

public class findandReplace {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
    
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        
        // Array to store mapping of each character (a=0, b=1, ..., z=25)
        // -1 means not assigned yet
        int[] mp = new int[26];
        for (int i = 0; i < 26; i++) {
            mp[i] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            int curr = s.charAt(i) - 'a';  // Convert character to index (0-25)
            
            if (mp[curr] == -1) {
                // First time seeing this character, assign it the required value
                mp[curr] = i % 2;
            } else {
                // Character already has a mapping, check if it matches required value
                if (mp[curr] != (i % 2)) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        
        System.out.println("YES");
    }
}