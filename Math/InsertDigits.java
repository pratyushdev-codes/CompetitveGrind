// A. Insert Digit
// time limit per test2 seconds
// memory limit per test256 megabytes
// You have a positive number of length 𝑛
//  and one additional digit.

// You can insert this digit anywhere in the number, including at the beginning or at the end.

// Your task is to make the result as large as possible.

// For example, you have the number 76543
// , and the additional digit is 4
// . Then the maximum number you can get is 765443
// , and it can be obtained in two ways — by inserting a digit after the 3
// th or after the 4
// th digit of the number.






import java.util.Scanner;

public class InsertDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            long n = sc.nextLong(); // Length of the number
            long d = sc.nextLong(); // Digit to insert
            String s = sc.next();   // The number as a string

            boolean inserted = false;
            StringBuilder result = new StringBuilder();

            // Try to insert digit d in such a way that the resulting number is largest
            for (int i = 0; i < s.length(); i++) {
                long currentDigit = s.charAt(i) - '0';
                if (!inserted && d > currentDigit) {
                    result.append(d);
                    inserted = true;
                }
                result.append(s.charAt(i));
            }

            // If not inserted yet, append at the end
            if (!inserted) {
                result.append(d);
            }

            System.out.println(result.toString());
        }
    }
}
