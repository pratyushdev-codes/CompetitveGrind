import java.util.*;

public class WonderfulColoring1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        while (t-- > 0) {
            String S = sc.nextLine();
            int[] freq = new int[26];
            int res = 0, ans = 0;

            for (int i = 0; i < S.length(); i++) {
                freq[S.charAt(i) - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if (freq[i] >= 2) {
                    ans++;
                } else if (freq[i] == 1) {
                    res++;
                }
            }

            ans += (res / 2);
            System.out.println(ans);
        }
        sc.close();
    }
}
