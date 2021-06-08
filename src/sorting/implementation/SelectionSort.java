/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/2/2021
 *   Time: 5:32 PM
 *   File: SelectionSort.java
 */

package sorting.implementation;

public class SelectionSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}