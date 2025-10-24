import java.util.ArrayList;
import java.util.Stack;

public class TopologicalGraph {
    static void topologicalSortUtil(int v, ArrayList<ArrayList<Integer>> adj,boolean[] visited, Stack<Integer> st) {
        
        // Mark the current node as visited
        visited[v] = true;

        // Recur for all adjacent vertices
        for (int i : adj.get(v)) {
            if (!visited[i]) {
                topologicalSortUtil(i, adj, visited, st);
            }
        }

        // Push current vertex to stack 
        // which stores the result
        st.push(v);
    }

    // Function to perform Topological Sort
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        
        // Stack to store the result
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V];

        // Call the recursive helper function to store
        // Topological Sort starting from all vertices one by one
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, adj, visited, st);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();

        // Append contents of stack
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }
        
        return ans;
    }
}



// TOPOLOGICAL SORT --> BFS , Kahn's Algorithm

import java.util.*;

public class TopologicalSort {
    
    // Function to perform Topological Sort
    public static List<Integer> topologicalSort(int vertices, List<List<Integer>> adjList) {
        // Step 1: Calculate in-degree for each node
        int[] inDegree = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            for (int neighbor : adjList.get(i)) {
                inDegree[neighbor]++;
            }
        }

        // Step 2: Initialize queue with nodes having zero in-degree
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();

        // Step 3: Process nodes from the queue
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            // Decrease in-degree of neighbors
            for (int neighbor : adjList.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Step 4: If result contains all vertices, return the result
        if (result.size() == vertices) {
            return result;
        } else {
            // If there's a cycle in the graph
            throw new IllegalStateException("Graph contains a cycle, cannot perform topological sort.");
        }
    }

    public static void main(String[] args) {
        // Example graph:
        // 5 vertices, 4 edges: 0 -> 1, 0 -> 2, 1 -> 3, 2 -> 3
        int vertices = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(2).add(3);

        // Perform Topological Sort
        try {
            List<Integer> topologicalOrder = topologicalSort(vertices, adjList);
            System.out.println("Topological Sort: " + topologicalOrder);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
