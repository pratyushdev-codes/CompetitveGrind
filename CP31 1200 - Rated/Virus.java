public import java.util.*;
  
public class Virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] v = new int[m];
            for (int i = 0; i < m; i++) {
                v[i] = sc.nextInt();  // O(m)
            }

            Arrays.sort(v);  // O(m log m)

            ArrayList<Integer> gaps = new ArrayList<>();
            for (int i = 0; i < m - 1; i++) {
                gaps.add(v[i + 1] - v[i] - 1);
            }  // O(m)

            gaps.add(v[0] + n - v[m - 1] - 1);

            // Sort in descending order
            gaps.sort(Collections.reverseOrder());  // O(m log m)

            int numSaved = 0, numDays = 0;

            for (int gap : gaps) {
                int currGap = gap - numDays * 2;
                if (currGap > 0) {
                    numSaved++; // left extremity of current gap

                    currGap -= 2;
                    if (currGap > 0) numSaved += currGap; // right extremity + all inside

                    numDays += 2;
                }
            }

            System.out.println(n - numSaved);
        }

        sc.close();
    }
}
 Virus {
    
}
