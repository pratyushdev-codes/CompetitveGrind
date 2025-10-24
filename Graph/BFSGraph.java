import java.util.*;
import java.util.LinkedList;

public class BFSGraph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt(); // number of nodes

        System.out.print("Enter number of edges: ");
        int m = sc.nextInt(); // number of edges

        int[][] edges = new int[m][2];
        System.out.println("Enter edges (u v):");

        for (int i = 0; i < m; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }

        System.out.print("Enter starting node for BFS: ");
        int start = sc.nextInt();

        sc.close();

        // Construct the graph
        List<List<Integer>> graph = constructGraph(n, m, edges);

        // Perform BFS
        BFS(n, graph, start);
    }

    // Construct adjacency list
    public static List<List<Integer>> constructGraph(int n, int m, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u); // for undirected graph
        }

        return graph;
    }

    // BFS Traversal
    public static void BFS(int n, List<List<Integer>> graph, int start) {
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        System.out.println("\nBFS Traversal:");
        while (!q.isEmpty()) {
            int rem = q.poll();
            System.out.print(rem + " ");

            for (int nbr : graph.get(rem)) {
                if (!vis[nbr]) {
                    vis[nbr] = true;
                    q.add(nbr);
                }
            }
        }
        System.out.println();
    }
}
