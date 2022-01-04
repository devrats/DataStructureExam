/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 16-Dec-21
 *   Time: 7:32 AM
 *   File: NQueen.java
 */

package greedy;

import java.util.ArrayList;
import java.util.List;

class NQueenProblem {
    final int N = 4;
    static int subset_count = 0;


    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    boolean isSafe(int board[][], int row, int col) {
        int i, j;
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    boolean solveNQUtil(int board[][], int col) {
        if (col >= N) {
            return true;
        }

        for (int i = 0; i < N; i++) {

            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQUtil(board, col + 1) == true) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    boolean solveNQ() {
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        if (solveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String args[]) {
        NQueenProblem Queen = new NQueenProblem();
        Queen.solveNQ();
        int[] list = {2, 3, 5, 7, 10};
        subset_sum(list,0,0,5);

    }

    public static void subset_sum(int list[], int sum, int starting_index, int target_sum)
    {
        if( target_sum == sum )
        {
            subset_count++;
            if(starting_index < list.length)
                subset_sum(list, sum - list[starting_index-1],starting_index, target_sum);
        }
        else
        {
            for( int i = starting_index; i < list.length; i++ )
            {
                subset_sum(list, sum + list[i], i + 1, target_sum);
            }
        }
    }
}

