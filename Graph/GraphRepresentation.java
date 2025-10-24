// import java.util.ArrayList;

// public class GraphRepresentation {
//     public static void main(String[] args) {
//         public List<List<Integer>> printGraph(int V , int edges[][]){
//             List<List<Integer>> graph = new ArrayList<>();
//             for(int i = 0 ; i < V ; i++){
//                 graph.add(new ArrayList<>()); // creating a list like structure on each level
//             }

//             for(int i[]:edges){
//                 int u = i[0];
//                 int v = i[1];
//                 graph.get(u).add(v);
//                 graph.get(v).add(u);

//                 // or we can do this also

//                 graph.get(i[0]).add(i[1]);
//                 graph.get(i[1]).add(i[0]);
//             }
//         }
//     }

// }

import java.util.ArrayList;
import java.util.Scanner;

public class GraphRepresentation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no of vertices
        int m = sc.nextInt(); // no of edges

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i =0; i <=n ; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0 ; i < m ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        sc.close();
    }
}