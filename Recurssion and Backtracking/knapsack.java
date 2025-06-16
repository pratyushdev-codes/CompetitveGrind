import java.util.Scanner;

public class knapsack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    
        int N = sc.nextInt();
        int W = sc.nextInt();
             int[] wt = new int[N];
        int[] val = new int[N];
        for (int i = 0; i < N; i++) {
            wt[i] = sc.nextInt();
            val[i] = sc.nextInt();
        }
        sc.close();

    }public static int knapsack(int N-1 , int W, int wt[], int val[]){
        int ans =0;
        if(N==0 || W==0){
            return 0;

        }
        if(wt[N-1]>W){
            return knapsack(N-1, W, wt, val);
        }
        
        if(wt[N-1]<=W){
            int include = val[N-1]+knapsack(N-1, W=wt[N-1], wt, val);
            int exclude = knapsack(n-1, W, wt, val);
            ans= Math.max(include, exclude);
        }

        return ans;
    }
}
