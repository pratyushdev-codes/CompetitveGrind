// Count number of connected components

// ALso - Count number of Provinces

import java.util.Queue;

public class countProvinces {

    public static void main(String[] args) {
        
    }  public void BFS(int u, int[][] isConnected, boolean[] visited){
      
        Queue<Integer> q  = new LinkedList<>();
        // boolean visited [] = new boolean[n];

        q.add(u);
        while(!q.isEmpty()){
            int rem = q.poll();

            for(int i = 0 ; i< isConnected.length ; i++){
                if(!visited[i] && isConnected[rem][i]==1){
                    q.add(i);
                    visited[i]= true;
                }
            }
        }


    }public int countConnectedComponents(int [][] isConnected){
        int n = isConnected.length;
        boolean [] visited = new boolean[n];

        int count = 0;
        for(int i =0 ; i<n ; i++){
            if(!visited[i]){
                count++;
                BFS(i, isConnected, visited);
     
            }
        }
            return count;
    }
}