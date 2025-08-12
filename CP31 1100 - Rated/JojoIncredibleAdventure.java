import java.util.*;

public class JojoIncredibleAdventure {
    static void solve(Scanner sc) {
        String s = sc.next();
        int n = s.length();
        int maxi = 0;
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '0') {
                i++;
                continue;
            }
            int j = i + 1;
            while (j < n && s.charAt(j) == '1') {
                j++;
            }
            maxi = Math.max(maxi, j - i);
            i = j;
        }

        if (maxi == n) {
            System.out.println((long) n * n);
            return;
        }

        if (s.charAt(0) == '1' && s.charAt(n - 1) == '1') {
            int cnt = 0;
            i = 0;
            while (i < n && s.charAt(i) == '1') {
                i++;
                cnt++;
            }
            int j = n - 1;
            while (j > i && s.charAt(j) == '1') {
                j--;
                cnt++;
            }
            maxi = Math.max(maxi, cnt);
        }

        maxi++;
        long temp = (maxi + 1) / 2;
        System.out.println(temp * (maxi / 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}
