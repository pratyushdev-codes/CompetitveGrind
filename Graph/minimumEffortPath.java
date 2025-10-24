import java.util.LinkedList;
import java.util.PriorityQueue;

class Pair{
    int first ;
    int second ;
    int third;

    Pair(int first , int second, int third){
        this.first= first;
        this.second = second;
        this.third= third;
    }
}
public class minimumEffortPath {
    public static void main(String[] args) {
        
    }public int minEffortPath(int[][] heights) {
        int m= heights.length;
        int n = heights[0].length;

        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.first - y.first);
        int [][] diff = new int [m][n];

        for(int i = 0 ; i< m ; i++){
            for(int j =0 ; j<n ; j++){
                diff[i][j] = (int)(1e9);
            }
        }
        diff[0][0] = 0;

        pq.offer(new Pair(0, 0, 0));

        int row [] = {0 , -1 , 0 , 1};
        int dcol [] = {-1 ,0 , +1 , 0};

        int count =0;
        while(!pq.isEmpty()){
            Pair rem = pq.poll();
            int dval = rem.first;
            int drow = rem.second;
            int dcol = rem.third;

            pq.poll();

            if(row == n-1 && col == m-1) return val;
            for(int  i =0 ; i< 4 ;i++){
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m ){
                    int newEffort = Math.max(Math.abs(heights[row][col] - heights[nrow][ncol]),val);
                    if(newEffort < diff[nrow][ncol]){
                        diff[nrow][ncol] = newEffort;
                        pq.offer(new Pair(newEffort,nrow,ncol));
                    }
                }
            }
        }
        return 0;
    }

]