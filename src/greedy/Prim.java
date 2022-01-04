/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 15-Dec-21
 *   Time: 10:42 PM
 *   File: Prim.java
 */

package greedy;

import java.lang.*;

class MST {

    int minKey(int key[], Boolean mstSet[], int vertix)
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < vertix; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    void printMST(int parent[], int graph[][], int vertix)
    {
        for (int i = 1; i < vertix; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }

    void primMST(int graph[][], int vertix)
    {
        int parent[] = new int[vertix];
        int key[] = new int[vertix];

        Boolean mstSet[] = new Boolean[vertix];

        for (int i = 0; i < vertix; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;
        for (int count = 0; count < vertix - 1; count++) {
            int u = minKey(key, mstSet, vertix);
            mstSet[u] = true;
            for (int v = 0; v < vertix; v++)
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }
        printMST(parent, graph, vertix);
    }

    public static void main(String[] args)
    {
        MST t = new MST();
        int graph[][] = new int[][]
                {{ 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        t.primMST(graph, 5);
    }
}


