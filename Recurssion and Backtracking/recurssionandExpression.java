import java.util.*;

public class recurssionandExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

    
        System.out.println(findOperations(A, 1, A[0], X) ? "YES" : "NO");
    }


    public static boolean findOperations(int[] A, int index, int sum, int target) {
        if (index == A.length) {
            return sum == target;
        }

        boolean plus = findOperations(A, index + 1, sum + A[index], target);
        boolean minus = findOperations(A, index + 1, sum - A[index], target);

        return plus || minus;
    }
}
