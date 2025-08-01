import java.util.*;

public class thousandtonsoftnt {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        long[] pre = new long[n];
        pre[0] = v[0];
        for (int i = 1; i < n; i++) {
            pre[i] = v[i] + pre[i - 1];
        }

        long ans = 0;
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            int start = k - 1;
            long maxi = pre[start];
            long mini = pre[start];

            for (int idx = start + k; idx < n; idx += k) {
                long curr = pre[idx] - pre[idx - k];
                maxi = Math.max(maxi, curr);
                mini = Math.min(mini, curr);
            }

            ans = Math.max(ans, maxi - mini);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        if (sc.hasNextInt()) {
            t = sc.nextInt();
        }

        while (t-- > 0) {
            solve(sc);
        }
    }
}


// You're given an array v of size n, and the task is to:

// Divide the array into equal-sized segments (only those sizes k which divide n exactly),

// For each valid k, compute the sum of elements in each segment of size k,

// Find the maximum and minimum segment sums for that k,

// Compute the difference between max and min segment sums, and

// Among all such valid k, output the maximum of those differences.

// 🧠 Thinking Step-by-Step
// ✅ Step 1: Prefix Sum Computation
// We use a prefix sum array pre[] to make range sum queries fast.

// pre[i] = v[0] + v[1] + ... + v[i]

// This allows you to get the sum of any subarray from i to j in O(1) using:

// bash
// Copy
// Edit
// sum(i, j) = pre[j] - pre[i-1]
// (and if i == 0, then just pre[j])

// So time is saved when computing the sum of chunks of size k.

// ✅ Step 2: Try All Possible Segment Sizes k
// Loop over all k from 1 to n. Only consider those for which:

// cpp
// Copy
// Edit
// if (n % k == 0)
// This ensures we can divide the array evenly into segments of size k.

// ✅ Step 3: Segment Sum Analysis
// For a given segment size k:

// The first segment sum is: pre[k-1]

// Next segment starts at index k and goes till 2k - 1, sum is:

// cpp
// Copy
// Edit
// pre[2k - 1] - pre[k - 1]
// And so on...

// For each segment:

// Keep track of the maximum segment sum and minimum segment sum.

// Compute their difference for this value of k.

// ✅ Step 4: Update Global Answer
// Track the maximum difference of maxi - mini for all k.

// ✅ Example
// Let’s say:

// text
// Copy
// Edit
// n = 6
// v = [3, 1, 4, 1, 5, 9]
// Valid segment sizes: 1, 2, 3, 6

// Try each k, compute sums of segments, and find difference between max and min sums.

// For k = 2:

// Segments: [3,1], [4,1], [5,9]

// Sums: 4, 5, 14 → difference = 14 - 4 = 10

// For k = 3:

// Segments: [3,1,4], [1,5,9]

// Sums: 8, 15 → difference = 7

// So among all values of k, maximum difference is 10.

// ⏱️ Time & Space Complexity
// Time complexity:

// O(n) for prefix sum.

// For each k (≤ n), we do up to n / k segment checks → roughly O(n log n) total.

// Space complexity:

// O(n) for prefix sum array.

