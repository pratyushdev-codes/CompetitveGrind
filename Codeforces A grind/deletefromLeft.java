import java.util.Scanner;

public class DeleteFromLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int totalLength = s1.length() + s2.length();
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        
        // Find the longest common suffix
        while (i >= 0 && j >= 0) {
            if (s1.charAt(i) == s2.charAt(j)) {
                totalLength -= 2; // We can keep this character in both strings
                i--;
                j--;
            } else {
                break; // Characters don't match, stop here
            }
        }
        
        System.out.println(totalLength);
        sc.close();
    }
}