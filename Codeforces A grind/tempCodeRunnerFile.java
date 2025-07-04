import java.util.*;
public class stablearrangementofRocks {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        char [][] mat= new char [(int)n][(int)n];

        for(int i =0 ; i < n ; i++){
            Arrays.fill(mat[i], '.');
        }
        int maxRcanbePlaced = (n/2)+n%2;

        if(k>maxRcanbePlaced){
            System.out.println(-1);
            return;
        }
    
        int i=0 ;
        while(i<n && k>0){
         mat[i][i] = 'R';
         i+=2;
         k--;
        }
                for (char[] row : mat) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
        }


    }
}
