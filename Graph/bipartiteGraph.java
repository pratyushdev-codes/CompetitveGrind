import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bipartiteGraph {

}    public boolean isBipartite(int[][] graph) {
    int [] check = new int [graph.length];
    Arrays.fill(grah, -1);


    for(int i = 0 ; i< check.length; i++){
        if(check[i]==-1){
            if(!bfs(graph , check , i)){
                return false;
            }
        }
    }
    return true;
}public boolean bfs(int [][] arr , int [] check , int start){
    Queue<Integer> q = new LinkedList<>();
    q.add(start);

    check[start]=0;
    while(!q.isEmpty()){
        int curr = q.poll();

        for(int dest : arr[curr]){
            if(check[dest]==-1){
                check[dest]= 1-check[curr];

            }else if(check[dest]==check[curr]){
                return false;
            }
        }

        return true;
    }



}
