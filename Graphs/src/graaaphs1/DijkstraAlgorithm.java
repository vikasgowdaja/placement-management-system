package graaaphs1;

import java.util.Arrays;

public class DijkstraAlgorithm {
    private static final int INFINITY = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] graph = {
            { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 }
        };

        int[] shortestDistances = dijkstra(graph, 0);

        System.out.println("Shortest distances from vertex 0:");
        for (int i = 0; i < shortestDistances.length; i++) {
            System.out.println("Vertex " + i + ": " + shortestDistances[i]);
        }
    }

    public static int[] dijkstra(int[][] graph, int source) {
        int vertices = graph.length;
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distances, INFINITY);
        distances[source] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int minDistanceVertex = findMinDistanceVertex(distances, visited);
            visited[minDistanceVertex] = true;

            for (int j = 0; j < vertices; j++) {
                if (!visited[j] && graph[minDistanceVertex][j] != 0
                        && distances[minDistanceVertex] != INFINITY
                        && distances[minDistanceVertex] + graph[minDistanceVertex][j] < distances[j]) {
                    distances[j] = distances[minDistanceVertex] + graph[minDistanceVertex][j];
                }
            }
        }

        return distances;
    }

    public static int findMinDistanceVertex(int[] distances, boolean[] visited) {
        int minDistance = INFINITY;
        int minDistanceVertex = -1;

        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                minDistanceVertex = i;
            }
        }

        return minDistanceVertex;
    }
}
