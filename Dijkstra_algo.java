import java.util.*;

class Main {

    static final int V = 4;

    int minDistance(int dist[], boolean visited[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && dist[v] < min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    void dijkstra(int graph[][], int src) {

        int dist[] = new int[V];
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {

            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {

                if (!visited[v] &&
                    graph[u][v] != 0 &&
                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        for (int i = 0; i < V; i++)
            System.out.println("Distance from source to " + i + " = " + dist[i]);
    }

    public static void main(String[] args) {

        int graph[][] = {
            {0, 4, 2, 0},
            {4, 0, 0, 5},
            {2, 0, 0, 1},
            {0, 5, 1, 0}
        };

        Main obj = new Main();
        obj.dijkstra(graph, 0);
    }
}
