import java.util.*;

public class LinearKeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // to consume newline after the number

        while (t-- > 0) {
            String keyboard = sc.nextLine();
            String s = sc.nextLine();

            int[] position = new int[26];
            for (int i = 0; i < 26; i++) {
                position[keyboard.charAt(i) - 'a'] = i;
            }

            int difSum = 0;
            for (int i = 1; i < s.length(); i++) {
                difSum += Math.abs(position[s.charAt(i) - 'a'] - position[s.charAt(i - 1) - 'a']);
            }

            System.out.println(difSum);
        }
    }
}
