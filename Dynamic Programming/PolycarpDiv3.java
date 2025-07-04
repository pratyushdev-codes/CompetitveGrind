import java.util.Scanner;

public class PolycarpDiv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        
        // Convert string digits to their mod 3 values
        int[] mod3 = new int[n];
        for(int i = 0; i < n; i++) {
            mod3[i] = (s.charAt(i) - '0') % 3;
        }
        
        int count = 0;
        int i = 0;
        
        while(i < n) {
            // Skip leading zeros (except single '0')
            if(s.charAt(i) == '0') {
                count++;
                i++;
            }
            // If current digit mod 3 == 0, it's divisible by 3
            else if(mod3[i] == 0) {
                count++;
                i++;
            }
            // Check if we can form a 2-digit number divisible by 3
            else if(i < n - 1) {
                // Two consecutive digits form a number divisible by 3
                // if sum of their mod 3 values is divisible by 3
                if((mod3[i] + mod3[i + 1]) % 3 == 0) {
                    count++;
                    i += 2;
                } else {
                    // Can't form divisible number, skip this digit
                    i++;
                }
            }
            else {
                // Last digit, can't form pair
                i++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}