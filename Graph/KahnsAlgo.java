// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.Queue;

// public class KahnsAlgo {
//     public static void main(String[] args) {
          
//     }public int [] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
//         int [] indegree = new int [V];

//         for(int u =0; u<V; u++){
//             for(int i: adj.get(u)){
//                 indegree[u]++;
//             }
//             // indegree Array


//             Queue<Integer> q = new LinkedList<>();

//             for(int i = 0; i<V; i++){
//                 if(indegree[i]==0){
//                     q.add(i);
//                 }
//             }

//             int [] kahnsAns= new int [V];
//             int i = 0;
//             while(!q.isEmpty()){
//                 int nodes = q.peek();
//                 q.remove();
//                 kahnsAns[i++]=nodes;


//                 for(int x: adj.get(nodes)){
//                     indegree[x]--;
//                     if(indegree[x]==0){
//                         q.add(x);
//                 }
//             }

          
//         }
    
//         return kahnsAns;    

//     }
    
// }

// }

import java.util.Queue;

import org.w3c.dom.Node;

public class KahnsAlgo {

    public static void main(String[] args) {
        
    }public static int [] topoSort(int V, ArrayList<ArrayList<Integer> adj){
        int indegree [] = new int [V];
        for(int i = 0 ; i< V ; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();

        for(int i = 0 ; i<V; i++){
            if(indegree[V]==0){
                q.add(i);
            }
        }

        int topo [] = new int [V];
        int i = 0 ;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo[i++]=node;



            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
            
        }
        return topo;

    }
}
