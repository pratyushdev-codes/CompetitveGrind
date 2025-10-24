import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    int node, cost;
    Pair(int node , int cost){
        this.node = node;
        this.cost = cost;
    }
}
public class DijkastraAlgo {
    public static void main(String[] args) {
        
    }public static int [] dijkastras(int V, List<List<Pair>> adj , int src){
       int [] dist = new int[V];
       PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a->a.cost));

       Arrays.fill(dist , Integer.MAX_VALUE);
       dist[src]=0;

       pq.offer(new Pair(src, 0));

       while(!pq.isEmpty()){
        Pair curr = pq.poll();
        int u = curr.node;
        int d = curr.cost;


        if(d>dist[u]) continue;

        for(Pair neigbor : adj.get(u)){
            int v = neigbor.node;
            int weight = neigbor.cost;

            if(dist[u]+weight<dist[v]){
                dist[v]= dist[u]+weight;
                pq.offer(new Pair(v, dist[v])); 
            }
        }
       }
       return dist;
    }
}
