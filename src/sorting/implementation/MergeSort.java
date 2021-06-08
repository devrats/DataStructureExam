/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/8/2021
 *   Time: 8:50 PM
 *   File: MergeSort.java
 */

package sorting.implementation;

public class MergeSort {
    public static void sort(int[] arr, int lowerLimit, int upperLimit) {
        if (lowerLimit < upperLimit) {
            int mid = (lowerLimit + upperLimit) / 2;
            sort(arr, lowerLimit, mid);
            sort(arr, mid + 1, upperLimit);
            merge(arr, lowerLimit, mid, upperLimit);
        }
    }

    private static void merge(int[] arr, int lowerLimit, int mid, int upperLimit) {
        int arr1 = mid - lowerLimit + 1;
        int arr2 = upperLimit - mid;

        int array1[] = new int[arr1];
        int array2[] = new int[arr2];

        for (int i = 0; i < arr1; ++i)
            array1[i] = arr[lowerLimit + i];
        for (int j = 0; j < arr2; ++j)
            array2[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = lowerLimit;
        while (i < arr1 && j < arr2) {
            if (array1[i] < array2[j]) {
                arr[k++] = array1[i++];
            } else {
                arr[k++] = array2[j++];
            }
        }
        for (; i < arr1; i++) {
            arr[k++] = array1[i];
        }
        for (; j < arr2; j++) {
            arr[k++] = array1[j];
        }

    }
}
