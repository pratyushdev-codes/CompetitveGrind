import java.util.ArrayList;

public class DetectCycleinaGraph {
    public static void main(String[] args) {
 
    } 
        // Function to detect cycle in an undirected graph.
    public boolean checkForCycle(int node,int parent ,ArrayList<ArrayList<Integer>> adj) {
        visited[node]= true;

        for(int it : adj.get(node)){
            if(visited[it]==false){
                if (checkForCycle(it, node, vis, adj) == true) return true;
            }
            else if(it!=parent) return true;
        }
        
    }public static void isCycle(ArrayList<ArrayList<Integer>> adj){
        int V = adj.size();
        for(int i = 0 ; i<V; i++){
            if(visited[V]==false){
                if(checkforCycle(i-1, adj, visited, -1)){
                    return true;
                }
                
            }
        }
        return false;
    }
}


import java.util.*;

