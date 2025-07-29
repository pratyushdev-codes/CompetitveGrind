import java.util.*;

public class RevserseSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.nextLine(); // Consume newline left after nextLong()
        String s = scanner.nextLine();

        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                System.out.println("YES");
                System.out.println((i + 1) + " " + (i + 2));
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("NO");
        }
    }
}