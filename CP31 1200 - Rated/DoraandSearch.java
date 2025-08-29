import java.util.*;

public class DoraandSearch {

    static boolean isMinOrMax(int val, TreeSet<Integer> segEle) {
        if (segEle.first() == val) return true;
        if (segEle.last() == val) return true;
        return false;
    } // O(1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // O(N)
            }

            // TreeSet keeps elements sorted like C++ set
            TreeSet<Integer> segEle = new TreeSet<>();
            for (int x : arr) {
                segEle.add(x);
            } // O(N log N)

            int i = 0, j = n - 1;

            while (i < j) {
                if (isMinOrMax(arr[i], segEle)) {
                    segEle.remove(arr[i]); // O(log N)
                    i++;
                    continue;
                }

                if (isMinOrMax(arr[j], segEle)) {
                    segEle.remove(arr[j]); // O(log N)
                    j--;
                    continue;
                }

                break;
            } // O(N log N)

            if (i < j) {
                System.out.println((i + 1) + " " + (j + 1));
            } else {
                System.out.println("-1");
            }
        }

        sc.close();
    }
}

//! Total time complexity : O(N log N)
//! Total space complexity : O(N)
