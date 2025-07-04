// C. Basketball Exercise
// time limit per test2 seconds
// memory limit per test256 megabytes
// Finally, a basketball court has been opened in SIS, so Demid has decided to hold a basketball exercise session. 2⋅𝑛
//  students have come to Demid's exercise session, and he lined up them into two rows of the same size (there are exactly 𝑛
//  people in each row). Students are numbered from 1
//  to 𝑛
//  in each row in order from left to right.


// Now Demid wants to choose a team to play basketball. He will choose players from left to right, and the index of each chosen player (excluding the first one taken) will be strictly greater than the index of the previously chosen player. To avoid giving preference to one of the rows, Demid chooses students in such a way that no consecutive chosen students belong to the same row. The first student can be chosen among all 2𝑛
//  students (there are no additional constraints), and a team can consist of any number of students.

// Demid thinks, that in order to compose a perfect team, he should choose students in such a way, that the total height of all chosen students is maximum possible. Help Demid to find the maximum possible total height of players in a team he can choose.

// Input
// The first line of the input contains a single integer 𝑛
//  (1≤𝑛≤105
// ) — the number of students in each row.

// The second line of the input contains 𝑛
//  integers ℎ1,1,ℎ1,2,…,ℎ1,𝑛
//  (1≤ℎ1,𝑖≤109
// ), where ℎ1,𝑖
//  is the height of the 𝑖
// -th student in the first row.

// The third line of the input contains 𝑛
//  integers ℎ2,1,ℎ2,2,…,ℎ2,𝑛
//  (1≤ℎ2,𝑖≤109
// ), where ℎ2,𝑖
//  is the height of the 𝑖
// -th student in the second row.

// Output
// Print a single integer — the maximum possible total height of players in a team Demid can choose.


import java.util.*;

public class BasketballExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long[] h1 = new long[n];
        for(int i = 0; i < n; i++) {
            h1[i] = sc.nextLong();
        }

        long[] h2 = new long[n];
        for(int i = 0; i < n; i++) {
            h2[i] = sc.nextLong();
        }


        // dp[i][j] = maximum height when considering first i positions
        // j=0: last selected from row 1, j=1: last selected from row 2, j=2: none selected yet
        long[][] dp = new long[n + 1][3];
        
        for(int i = 1; i <= n; i++) {
            // Option 1: Select from row 1 at position i
            dp[i][0] = Math.max(dp[i-1][1] + h1[i-1], dp[i-1][2] + h1[i-1]);
            
            // Option 2: Select from row 2 at position i  
            dp[i][1] = Math.max(dp[i-1][0] + h2[i-1], dp[i-1][2] + h2[i-1]);
            
            // Option 3: Don't select anyone at position i
            dp[i][2] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
        }
        
        System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
    }
}
