import java.util.*;

public class DijkstraPath {
    static final int MX = 100005;
    static List<List<int[]>> cost = new ArrayList<>();
    static int[] vis = new int[MX];
    static int[] par = new int[MX];
    static int[] dist = new int[MX];
    static int N, E;

    static boolean dijkstra(int st, int en) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        Arrays.fill(dist, 1, N + 1, Integer.MAX_VALUE);
        pq.add(new int[]{0, st});
        par[st] = -1;
        dist[st] = 0;

        while (!pq.isEmpty()) {
            int h = pq.poll()[1];
            if (h == en)
                return true;
            vis[h] = 1;
            for (int[] i : cost.get(h)) {
                int v = i[0], w = i[1];
                if (vis[v] == 0 && dist[h] + w < dist[v]) {
                    dist[v] = dist[h] + w;
                    pq.add(new int[]{dist[v], v});
                    par[v] = h;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u, v, w;
        N = sc.nextInt();
        E = sc.nextInt();

        for (int i = 0; i <= N; i++)
            cost.add(new ArrayList<>());

        for (int i = 0; i < E; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            w = sc.nextInt();
            cost.get(u).add(new int[]{v, w});
            cost.get(v).add(new int[]{u, w});
        }

        if (dijkstra(1, N)) {
            List<Integer> path = new ArrayList<>();
            int i = N;
            while (i != -1) {
                path.add(i);
                i = par[i];
            }
            for (int j = path.size() - 1; j >= 0; j--)
                System.out.print(path.get(j) + " ");
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }
}


