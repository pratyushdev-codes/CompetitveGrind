import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathAlgoUG {
    public static void main(String[] args) {
        
    }public int [] shortestPath(int[][] edges, int n , int m , int src){
           //Create an adjacency list of size N for storing the undirected graph.

           ArrayList<ArrayList<Integer>> adj = new ArrayList<>();


           for(int i = 0 ; i<n ;i++){
            adj.add(new ArrayList<>());
           }


           for(int i =0; i<m ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
           }


           int dist [] = new int [n];
           for(int i = 0 ;i<n ;i++){
            dist[i]= Integer.MAX_VALUE;
        
           }
           dist[src]=0;



           //..// Applying BFS
           Queue<Integer> q = new LinkedList<>();
           q.add(src);
           while(!q.isEmpty()){
            int size= q.size();
            int node = q.peek();
            q.remove();
            for(int nbr : adj.get(node)){
                if(dist[node]+1<dist[nbr]){
                    dist[nbr]= 1+ dist[node];
                    q.add(nbr);
                }
            }
           }


                   // Updated shortest distances are stored in the resultant array ‘ans’.
        // Unreachable nodes are marked as -1. 


        for(int i =0; i<n ; i++){
            if(dist[i]==Integer.MAX_VALUE){
                dist[i]= -1;
            }
        }
        return dist;
    }
}
