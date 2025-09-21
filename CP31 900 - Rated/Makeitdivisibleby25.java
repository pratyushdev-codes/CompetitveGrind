import java.util.*;

public class Makeitdivisibleby25 {
    public static int minOperations(String n, String possibleValue) {
        int operations = 0;
        int checkerIndex = possibleValue.length() - 1;
        
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) == possibleValue.charAt(checkerIndex)) {
                checkerIndex--;
                if (checkerIndex < 0) {
                    break;
                }
            } else {
                operations++;
            }
        }
        
        if (checkerIndex >= 0) {
            return Integer.MAX_VALUE;
        }
        return operations;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        
        String[] possibleValues = {"00", "25", "50", "75"};
        
        while (t-- > 0) {
            String n = sc.nextLine();
            int ans = Integer.MAX_VALUE;
            
            for (String possibleValue : possibleValues) {
                ans = Math.min(ans, minOperations(n, possibleValue));
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}