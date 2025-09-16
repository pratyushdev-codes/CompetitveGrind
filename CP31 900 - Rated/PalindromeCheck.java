// 🔹 Problem Restatement

// We are given:

// A string s of length n.

// An integer k (number of characters we must delete).

// We need to check:
// 👉 After removing exactly k characters, can the remaining string be rearranged to form a palindrome?

// 🔹 Reminder: When can a string be rearranged into a palindrome?
    
// A palindrome has mirrored halves.

// So:

// If the length of the string is even, every character must appear an even number of times.

// If the length is odd, at most one character can have an odd frequency, the rest must be even.

// ➡️ More generally:
// The number of characters with odd frequency (let’s call it odd_frequency) determines feasibility.


import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            String s = sc.next();
            
            int[] frequencyOfCharacters = new int[26];
            for (int i = 0; i < n; i++) {
                frequencyOfCharacters[s.charAt(i) - 'a']++;
            }
            
            long oddFrequency = 0;
            for (int i = 0; i < 26; i++) {
                oddFrequency += frequencyOfCharacters[i] % 2;
            }
            
            if (oddFrequency > k + 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
