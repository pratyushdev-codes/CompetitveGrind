import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countVow(str, 0));
    }

    public static int countVow(String str, int idx) {
        if (idx == str.length()) {
            return 0;
        }

        char ch = Character.toUpperCase(str.charAt(idx));
        int count = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? 1 : 0;

        return count + countVow(str, idx + 1);
    }
}
