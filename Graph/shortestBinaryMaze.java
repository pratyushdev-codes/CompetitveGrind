import java.util.*;

public class shortestBinaryMaze {

    public class Pair{
        int distance;
        int row;
        int col;

        Pair(int distance , int row, int col){
            this.distance = distance;
            this.row = row;
            this.col = col;
        }
    }
    public static void main(String[] args) {
        
    }  public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 0 , 0 ));
        grid[0][0] = 1;

        while(!q.isEmpty()){
            Pair rem = q.poll();
            int distance = rem.distance;
            int row = rem.row;
            int col = rem.col;


            if(row ==n-1 && col== n-1){
                return distance;

            }

            for(int i =-1 ; i<= 1 ; i++){
                for(int j = -1 ; j<= 1; j++){
                    int newRow = row + i;
                    int newCol = col+ j;

                    if(newRow>= 0 && newRow < n && newCol<n && grid[newRow][newCol]==0){
                    q.add(new Pair(distance +1 , newRow, newCol));
                    grid[newRow][newCol]=1;

                    }
                }
            }
        }
            return -1;
    }
}
