/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/2/2021
 *   Time: 3:20 PM
 *   File: Main.java
 */

package searching.main;

import searching.implementation.BinarySearch;
import searching.implementation.SequentialSearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 34, 53, 534, 23, 21};
        SequentialSearch sequentialSearch = new SequentialSearch();
        sequentialSearch.search(5, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        sequentialSearch.searchArray(12, arr);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(7, arr1, arr1.length);
    }
}