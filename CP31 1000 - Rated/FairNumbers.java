import java.util.Scanner;

public class FairNumbers{
    
    // Function to check if a number is "fair"
    static boolean isFair(long n) {
        long num = n;
        while (num != 0) {
            int x = (int)(num % 10);  // Get the last digit
            if (x != 0 && n % x != 0) {  // If digit isn't zero and doesn't divide n
                return false;
            }
            num /= 10;  // Remove the last digit
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Read number of test cases
        
        while (t-- > 0) {
            long n = scanner.nextLong();  // Read the number to check
            
            // Increment n until we find a fair number
            while (!isFair(n)) {
                n += 1;
            }
            
            System.out.println(n);  // Print the fair number
        }
        
        scanner.close();
    }
}