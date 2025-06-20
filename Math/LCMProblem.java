// A. LCM Problem
// time limit per test2 seconds
// memory limit per test256 megabytes
// Let 𝐿𝐶𝑀(𝑥,𝑦)
//  be the minimum positive integer that is divisible by both 𝑥
//  and 𝑦
// . For example, 𝐿𝐶𝑀(13,37)=481
// , 𝐿𝐶𝑀(9,6)=18
// .

// You are given two integers 𝑙
//  and 𝑟
// . Find two integers 𝑥
//  and 𝑦
//  such that 𝑙≤𝑥<𝑦≤𝑟
//  and 𝑙≤𝐿𝐶𝑀(𝑥,𝑦)≤𝑟
// .

// Input
// The first line contains one integer 𝑡
//  (1≤𝑡≤10000
// ) — the number of test cases.

// Each test case is represented by one line containing two integers 𝑙
//  and 𝑟
//  (1≤𝑙<𝑟≤109
// ).

// Output
// For each test case, print two integers:

// if it is impossible to find integers 𝑥
//  and 𝑦
//  meeting the constraints in the statement, print two integers equal to −1
// ;
// otherwise, print the values of 𝑥
//  and 𝑦
//  (if there are multiple valid answers, you may print any of them).
// Example
// InputCopy
// 4
// 1 1337
// 13 69
// 2 4
// 88 89
// OutputCopy
// 6 7
// 14 21
// 2 4
// -1 -1

import java.util.*;

public class LCMProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int x = l;
            int y = 2 * l;

            if (y <= r) {
                System.out.println(x + " " + y);
            } else {
                System.out.println("-1 -1");
            }
        }

        sc.close();
    }
}
