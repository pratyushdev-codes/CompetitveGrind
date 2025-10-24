import java.util.*;
public class GraphCycleDetection {

    // Function to detect cycle in a directed graph using DFS
    public static boolean hasCycleDirectedDFS(int[][] graph) {
        int numVertices = graph.length;
        int[] visited = new int[numVertices]; // 0: unvisited, 1: visiting, 2: visited

        for (int i = 0; i < numVertices; i++) {
            if (visited[i] == 0) {
                if (dfsDirected(graph, i, visited)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle found
    }

    private static boolean dfsDirected(int[][] graph, int vertex, int[] visited) {
        visited[vertex] = 1; // Mark as visiting

        for (int neighbor : graph[vertex]) {
            if (visited[neighbor] == 1) {
                return true; // Cycle detected (back edge)
            } else if (visited[neighbor] == 0) {
                if (dfsDirected(graph, neighbor, visited)) {
                    return true; // Cycle detected in deeper recursion
                }
            }
        }

        visited[vertex] = 2; // Mark as visited
        return false;
    }

    // Function to detect cycle in an undirected graph using DFS
    public static boolean hasCycleUndirectedDFS(List<List<Integer>> graph) {
        int numVertices = graph.size();
        boolean[] visited = new boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            if (!visited[i]) {
                if (dfsUndirected(graph, i, -1, visited)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle found
    }

    private static boolean dfsUndirected(List<List<Integer>> graph, int vertex, int parent, boolean[] visited) {
        visited[vertex] = true;

        for (int neighbor : graph.get(vertex)) {
            if (!visited[neighbor]) {
                if (dfsUndirected(graph, neighbor, vertex, visited)) {
                    return true; // Cycle detected in deeper recursion
                }
            } else if (neighbor != parent) {
                return true; // Cycle detected (back edge)
            }
        }
        return false;
    }

    // Example Usage
    public static void main(String[] args) {
        // Directed Graph Example
        int[][] directedGraph = {
                {1, 2},
                {2},
                {0, 3},
                {3}
        };

        System.out.println("Directed Graph has cycle: " + hasCycleDirectedDFS(directedGraph)); // Output: true

        int[][] directedGraph2 = {
                {1, 2},
                {2},
                {3},
                {}
        };

        System.out.println("Directed Graph 2 has cycle: " + hasCycleDirectedDFS(directedGraph2)); // Output: false

        // Undirected Graph Example
        List<List<Integer>> undirectedGraph = new ArrayList<>();
        undirectedGraph.add(Arrays.asList(1, 2));
        undirectedGraph.add(Arrays.asList(0, 2));
        undirectedGraph.add(Arrays.asList(0, 1, 3));
        undirectedGraph.add(Arrays.asList(2));

        System.out.println("Undirected Graph has cycle: " + hasCycleUndirectedDFS(undirectedGraph)); // Output: true

        List<List<Integer>> undirectedGraph2 = new ArrayList<>();
        undirectedGraph2.add(Arrays.asList(1));
        undirectedGraph2.add(Arrays.asList(0, 2));
        undirectedGraph2.add(Arrays.asList(1, 3));
        undirectedGraph2.add(Arrays.asList(2));

        System.out.println("Undirected Graph 2 has cycle: " + hasCycleUndirectedDFS(undirectedGraph2)); // Output: false
    }
}