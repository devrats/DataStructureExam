/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/2/2021
 *   Time: 5:27 PM
 *   File: Main.java
 */

package sorting.main;

import sorting.implementation.CountingSort;
import sorting.implementation.MergeSort;
import sorting.implementation.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,8,6,4,2,1,0};
//        System.out.println(Arrays.toString(BubbleSort.sort(arr)));
//        arr = new int[]{100, 80, 60, 40, 20, 10};
//        System.out.println(Arrays.toString(SelectionSort.sort(arr)));
//        arr = new int[]{100, 80, 60, 40, 20, 10};
//        System.out.println(Arrays.toString(InsertionSort.sort(arr)));
//        arr = new int[]{100, 80, 60, 40, 20, 10};
//        MergeSort.sort(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        int [] arr = new int[]{5,3,2,6,4,1,3,7};
        QuickSort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
//        CountingSort.sort(arr);
    }
}