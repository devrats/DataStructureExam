/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 16-Dec-21
 *   Time: 7:27 AM
 *   File: Dijkastra.java
 */

package greedy;

import java.lang.*;


class ShortestPath {
    int minDistance(int dist[], Boolean sptSet[], int vertix)
    {
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int v = 0; v < vertix; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    void printSolution(int dist[], int vertix)
    {
        for (int i = 0; i < vertix; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    void dijkstra(int graph[][], int src, int vertix)
    {
        int dist[] = new int[vertix];
        Boolean sptSet[] = new Boolean[vertix];
        for (int i = 0; i < vertix; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < vertix - 1; count++) {
            int u = minDistance(dist, sptSet, vertix);
            sptSet[u] = true;
            for (int v = 0; v < vertix; v++)
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
        printSolution(dist,vertix);
    }

    public static void main(String[] args)
    {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0},
                { 4, 0, 8, 0, 0},
                { 0, 8, 0, 7, 0},
                { 0, 0, 7, 0, 9 },
                { 0, 0, 0, 9, 0}};
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0, 5);
    }
}
