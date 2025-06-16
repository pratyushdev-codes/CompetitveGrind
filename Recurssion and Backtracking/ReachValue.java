import java.util.Scanner;

public class ReachValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long N = sc.nextLong();
            if (canReach(N, 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean canReach(long N, long curr){
        if (curr == N) return true;
        if (curr > N) return false;

        // Try both operations
        return canReach(N, curr * 10) || canReach(N, curr * 20);
    }
}
