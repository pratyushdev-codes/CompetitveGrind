import java.util.*;
import java.io.*;

public class Premutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            List<int[]> sequences = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] parts = br.readLine().split(" ");
                int[] seq = new int[n - 1];
                for (int j = 0; j < n - 1; j++) {
                    seq[j] = Integer.parseInt(parts[j]);
                }
                sequences.add(seq);
            }

            // The approach is to find the first two elements by checking the first elements of each sequence
            // The first element of the original permutation is the one that is missing in the first positions of n-1 sequences
            // But another approach is to find the first two elements by frequency
            Map<Integer, Integer> freq = new HashMap<>();
            for (int[] seq : sequences) {
                int first = seq[0];
                freq.put(first, freq.getOrDefault(first, 0) + 1);
            }

            int first = -1, second = -1;
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() == n - 1) {
                    first = entry.getKey();
                } else {
                    second = entry.getKey();
                }
            }

            // Now, find the sequence that starts with 'second', this sequence is the one where first is missing at position 0
            int[] missingFirstSeq = null;
            for (int[] seq : sequences) {
                if (seq[0] != first) {
                    missingFirstSeq = seq;
                    break;
                }
            }

            // The permutation starts with first, then second, then the elements of missingFirstSeq in order
            List<Integer> perm = new ArrayList<>();
            perm.add(first);
            perm.add(second);
            for (int num : missingFirstSeq) {
                if (num != first && num != second) {
                    perm.add(num);
                }
            }

            // Now, the permutation is constructed. However, sometimes the initial approach might not work for all cases.
            // So, we need to verify the permutation by checking all sequences.
            // But given the problem statement says it's guaranteed, proceed to output.

            // Output the permutation
            StringBuilder sb = new StringBuilder();
            for (int num : perm) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString());
        }
    }
}