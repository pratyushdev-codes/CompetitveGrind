import java.util.*;

public class NumberofWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();

        System.out.println(countSteps(S, E));
    }

    public static int countSteps(int S, int E) {
        if (S > E) return 0;
        if (S == E) return 1;

        return countSteps(S + 1, E) + countSteps(S + 2, E) + countSteps(S + 3, E);
    }
}
