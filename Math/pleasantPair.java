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



import java.util.*;

public class pleasantPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1]; // 1-based indexing
            Map<Integer, Integer> valueToIndex = new HashMap<>();

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
                valueToIndex.put(arr[i], i);
            }

            int count = 0;
            // Loop for all possible products <= 2n
            for (int i = 1; i <= 2 * n; i++) {
                for (int x = 1; x * x < i; x++) {
                    if (i % x == 0) {
                        int y = i / x;
                        if (x == y) continue;
                        if (valueToIndex.containsKey(x) && valueToIndex.containsKey(y)) {
                            int idx1 = valueToIndex.get(x);
                            int idx2 = valueToIndex.get(y);
                            if (idx1 < idx2 && x * y == idx1 + idx2) {
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
