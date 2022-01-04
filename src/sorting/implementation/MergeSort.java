/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/8/2021
 *   Time: 8:50 PM
 *   File: MergeSort.java
 */

package sorting.implementation;

public class MergeSort {
    public static void sort(int arr[], int lower, int upper)
    {
        if (lower < upper) {
            // Find the middle point
            int m =lower+ (upper-lower)/2;

            // Sort first and second halves
            sort(arr, lower, m);
            sort(arr, m + 1, upper);

            // Merge the sorted halves
            merge(arr, lower, m, upper);
        }
    }

    public static void merge(int arr[], int lower, int mid, int upper) {
        int left = mid - lower + 1;
        int right = upper - mid;
        int L[] = new int[left];
        int R[] = new int[right];
        for (int i = 0; i < left; ++i) {
            L[i] = arr[lower + i];
        }
        for (int j = 0; j < right; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = lower;
        while (i < left && j < right) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < left) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < right) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
