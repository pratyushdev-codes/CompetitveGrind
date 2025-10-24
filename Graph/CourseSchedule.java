import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public static void main(String[] args) {
        
    }  public boolean canFinish(int V, int[][] graph) {
        int indegree [] = new int [V];
        calculateIndegree(indegree, graph);

        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i =0 ; i< indegree.length; i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int rem = q.poll();
            list.add(rem);
            for(int i = 0 ; i < graph.length ; i++){
                if(graph[i][0]==rem){
                    indegree[graph[i][0]]--;
                    if(indegree[graph[i][0]]==0){
                        q.offer(graph[i][0]);
                    }
                }
            }

            if(list.size()!=V){
                return false;
            }else{
                return true;
            }
        }



    }public int calculateIndegree(int indegree [], int graph [][]){
        for(int i =0 ; i < graph.length ; i++){
            indegree[graph[i][0]]++;
        }
    }
}
