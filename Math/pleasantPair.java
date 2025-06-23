// B. Pleasant Pairs
// time limit per test2 seconds
// memory limit per test256 megabytes
// You are given an array 𝑎1,𝑎2,…,𝑎𝑛
//  consisting of 𝑛
//  distinct integers. Count the number of pairs of indices (𝑖,𝑗)
//  such that 𝑖<𝑗
//  and 𝑎𝑖⋅𝑎𝑗=𝑖+𝑗
// .

// Input
// The first line contains one integer 𝑡
//  (1≤𝑡≤104
// ) — the number of test cases. Then 𝑡
//  cases follow.

// The first line of each test case contains one integer 𝑛
//  (2≤𝑛≤105
// ) — the length of array 𝑎
// .

// The second line of each test case contains 𝑛
//  space separated integers 𝑎1,𝑎2,…,𝑎𝑛
//  (1≤𝑎𝑖≤2⋅𝑛
// ) — the array 𝑎
// . It is guaranteed that all elements are distinct.

// It is guaranteed that the sum of 𝑛
//  over all test cases does not exceed 2⋅105
// .

// Output
// For each test case, output the number of pairs of indices (𝑖,𝑗)
//  such that 𝑖<𝑗
//  and 𝑎𝑖⋅𝑎𝑗=𝑖+𝑗
// .

// Example
// InputCopy
// 3
// 2
// 3 1
// 3
// 6 1 5
// 5
// 3 1 5 9 2
// OutputCopy
// 1
// 1
// 3
// Note
// For the first test case, the only pair that satisfies the constraints is (1,2)
// , as 𝑎1⋅𝑎2=1+2=3

// For the second test case, the only pair that satisfies the constraints is (2,3)
// .

// For the third test case, the pairs that satisfy the constraints are (1,2)
// , (1,5)
// , and (2,3)
// .



import java.util.*;

public class pleasantPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];  // 1-based indexing
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            // Store value to index mapping
            Map<Integer, Integer> valueToIndex = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                valueToIndex.put(a[i], i);
            }

            int count = 0;

            // For each i < j, we check if a[i] * a[j] == i + j
            // Instead, fix the product and check if it can be formed
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k * a[i] <= 2 * n; k++) {
                    int prod = k * a[i];
                    if (valueToIndex.containsKey(k)) {
                        int j = valueToIndex.get(k);
                        if (i < j && a[i] * a[j] == i + j) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}
