import java.util.Scanner;

public class YarikandArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a [] = new int [n];
            for(int i =0 ; i < n ; i++){
                a[i]= sc.nextInt();
            
            }
            int ans = Integer.MIN_VALUE;
            int i =0;
            int j =0;
            int sum =0;
            while(j<n){
                if(sum<0){
                    sum=0;
                    i=j;
                }

                if(i<j){
                    if(((a[j]^ a[j-1]) & 1)!=0){
                        sum += a[j];
                    }else{
                        sum = a[j];
                        i=j;
                    }
                }else{
                    sum= a[j];
                }

                ans= Math.max(ans, sum);
                j++;
            }
            System.out.println(ans);
        }
    }
    
}


// Purpose: Checking if two numbers have different parity
// The goal is to determine if v[j] and v[j-1] have different parity (one is odd, one is even).
// Step-by-step explanation:

// XOR operation (v[j] ^ v[j-1]):

// XOR gives 0 when bits are the same, 1 when bits are different
// When you XOR two numbers, if they have the same parity (both odd or both even), the least significant bit (LSB) will be 0
// If they have different parity (one odd, one even), the LSB will be 1


// Why & 1?

// The & 1 operation extracts only the least significant bit
// & 1 masks out all other bits except the rightmost bit
// This gives us either 0 (same parity) or 1 (different parity)



// Examples:
// Case 1: v[j] = 5 (odd), v[j-1] = 4 (even)
// 5 in binary: 101
// 4 in binary: 100
// 5 ^ 4 = 001
// 001 & 1 = 1 → Different parity ✓

// Case 2: v[j] = 6 (even), v[j-1] = 4 (even)  
// 6 in binary: 110
// 4 in binary: 100
// 6 ^ 4 = 010
// 010 & 1 = 0 → Same parity ✗

// Case 3: v[j] = 7 (odd), v[j-1] = 3 (odd)
// 7 in binary: 111  
// 3 in binary: 011
// 7 ^ 3 = 100
// 100 & 1 = 0 → Same parity ✗
// The algorithm's logic:

// If consecutive elements have different parity: continue adding to the current sum
// If consecutive elements have same parity: start a new subarray from the current element

// This suggests the problem is finding the maximum sum of a subarray where all consecutive pairs have alternating parity (odd-even-odd-even... or even-odd-even-odd...).Claude does not have the ability to run the code it generates yet.P