import java.util.Scanner;

public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.ne
        }
    }
}
import java.util.Scanner;

public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        while (testCases-- > 0) {
            String s = scanner.next();
            String t = scanner.next();
            
            int n = s.length();
            int m = t.length();
            
            int[] frequencyInT = new int[26];
            for (int i = 0; i < m; i++) {
                frequencyInT[t.charAt(i) - 'A']++;
            }
            
            char[] sChars = s.toCharArray();
            for (int i = n - 1; i >= 0; i--) {
                if (frequencyInT[sChars[i] - 'A'] > 0) {
                    frequencyInT[sChars[i] - 'A']--;
                } else {
                    sChars[i] = '.'; // Mark for deletion
                }
            }
            
            StringBuilder finalString = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (sChars[i] != '.') {
                    finalString.append(sChars[i]);
                }
            }
            
            if (finalString.toString().equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}