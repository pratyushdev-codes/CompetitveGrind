import java.util.Scanner;

public class suffixSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long A[] = new long[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextLong();
        }
        System.out.println(summation(A, n - m, n));
    }

    public static long summation(long[] A, long start, long end){
        if(start == end) return 0; // base case
        return A[start] + summation(A, start + 1, end);
    }
}
