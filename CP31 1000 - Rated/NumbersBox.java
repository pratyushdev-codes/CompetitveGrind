import java.util.Scanner;

public class NumbersBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat [][] = new int [n][m];
            for(int i =0 ; i<n ; i++){
                for(int j = 0 ; j<m ;j++){
                    mat[i][j] = sc.nextInt();
                }
            }

            int negetive =0;
            int minimum = Integer.MAX_VALUE;
            int sum =0;

            for(int i =0 ; i <n ; i++){
                for(int j =0 ; j<m ; j++){
                    if(mat[i][j]<0){
                        negetive++;
                    }
                    minimum = Math.min(minimum, Math.abs(mat[i][j]));
                    sum+= Math.abs(mat[i][j]);
                }
            }
            if(negetive%2==0){
                System.out.println(sum);
            }else{
                System.out.println(sum - 2*minimum);
            }

        }
        sc.close();
    }
}
