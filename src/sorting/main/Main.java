/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 6/2/2021
 *   Time: 5:27 PM
 *   File: Main.java
 */

package sorting.main;

import sorting.implementation.BubbleSort;
import sorting.implementation.InsertionSort;
import sorting.implementation.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {100,80,60,40,20,10};
        System.out.println(Arrays.toString(BubbleSort.sort(arr)));
        arr = new int[]{100, 80, 60, 40, 20, 10};
        System.out.println(Arrays.toString(SelectionSort.sort(arr)));
        arr = new int[]{100, 80, 60, 40, 20, 10};
        System.out.println(Arrays.toString(InsertionSort.sort(arr)));

    }
}