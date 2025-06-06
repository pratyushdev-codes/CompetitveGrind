import java.util.*;

public class postalCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Assuming n and m are provided as input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        List<String> v = new ArrayList<>();
        Set<String> st = new HashSet<>();
        
        // Read n strings into vector
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            v.add(s);
        }
        
        // Read m strings into set
        for (int i = 0; i < m; i++) {
            String s = scanner.next();
            st.add(s);
        }
        
        int ans = 0;
        
        // Check substrings of length 3 from each string in vector
        for (int i = 0; i < n; i++) {
            String s = v.get(i).substring(3);
            if (st.contains(s)) {
                ans++;
            }
        }
        
        System.out.println(ans);
        scanner.close();
    }
}