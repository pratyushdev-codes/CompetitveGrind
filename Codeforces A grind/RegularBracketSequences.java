import java.util.Scanner;

public class RegularBracketSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                StringBuilder sb = new StringBuilder();

                // Add i nested brackets: (((...)))
                for (int j = 0; j < i; j++) sb.append('(');
                for (int j = 0; j < i; j++) sb.append(')');

                // Add (n - i) simple bracket pairs: ()()...
                for (int j = 0; j < n - i; j++) {
                    sb.append("()");
                }

                System.out.println(sb.toString());
            }
        }
    }
}
