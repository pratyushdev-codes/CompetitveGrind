import java.util.HashMap;
import java.util.Scanner;

public class Swappable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        long totalPairs = nc2(n);
        long invalidPairs = 0;

        for (int count : hm.values()) {
            invalidPairs += nc2(count);
        }

        System.out.println(totalPairs - invalidPairs);
    }

    private static long nc2(long x) {
        return x * (x - 1) / 2;
    }
}
